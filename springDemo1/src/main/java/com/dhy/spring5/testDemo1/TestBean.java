package com.dhy.spring5.testDemo1;

import com.dhy.spring5.bean.Emp;
import com.dhy.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    /**
      * @Description: 测试外部bean注入（set方法）
      *
      */
    @Test
    public void testBean1() {
        //解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2、获取配置文件创建的的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    //内部bean方法
    @Test
    public void testBean2() {
        //解析配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");//内部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");//级联赋值（实际就是使用外部bean）
        //2、获取配置文件创建的的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
