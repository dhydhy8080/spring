package com.dhy.test.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect //生成代理对象
@Order(1)  //当有多个代理类时，设置这些代理类的执行顺序
public class UserProxy {
    //.*(..)针对所有方法，针对单个方法如add()，使用add(..)
    //相同切入点抽取，下面的注解只需写抽取的方法
    @Pointcut(value = "execution(* com.dhy.test.aspectJ.User.*(..))")
    public void pointCut() {
        
    }
    //在被增强的方法执行前执行
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("before......");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointCut()")
    public void AfterReturning() {
        System.out.println("AfterReturning.....");
    }
    //最终通知
    @After(value = "pointCut()")
    public void After() {
        System.out.println("After.....");
    }
    //异常通知
    @AfterThrowing(value = "pointCut()")
    public void AfterThrowing() {
        System.out.println("AfterThrowing.....");
    }
    //环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }
}
