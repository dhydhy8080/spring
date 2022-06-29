package com.dhy.test;

import com.dhy.test.aspectJ.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    //纯注解开发，不使用 xml 配置文件
    @Test
    public void testAOP1() {

    }

    @Test
    public void testAOP2() {
        //解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置文件创建的对象
        User user = context.getBean("user", User.class);

        user.add();
        user.sub();
    }
}
