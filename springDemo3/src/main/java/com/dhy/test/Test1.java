package com.dhy.test;

import com.dhy.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void testAnotation1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }
}
