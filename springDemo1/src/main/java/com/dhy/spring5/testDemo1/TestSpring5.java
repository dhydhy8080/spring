package com.dhy.spring5.testDemo1;

import com.dhy.spring5.Order;
import com.dhy.spring5.Student;
import com.dhy.spring5.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd() {
        //1、加载spring配置文件、
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("User", User.class);

        System.out.println(user);
        user.add();
    }

    //测试使用set方法，进行依赖注入
    @Test
    public void testAdd2() {
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        Student student = context.getBean("Student", Student.class);
        System.out.println(student);
    }

    //测试使用有参构造，进行依赖注入
    @Test
    public void testAdd3() {
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }
}
