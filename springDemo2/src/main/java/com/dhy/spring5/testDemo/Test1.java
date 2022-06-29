package com.dhy.spring5.testDemo;

import com.dhy.spring5.collectionType.Stu;
import com.dhy.spring5.collectionType.Teacher;
import com.dhy.spring5.factorybean.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void testBean1() {
        //1、解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置文件创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        System.out.println(stu);
    }

    /*
    工厂 bean
    */
    @Test
    public void testBean2() {
        //1、解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2、获取配置文件创建的对象

        //普通bean，只能返回配置的对象类型
//        MyBean myBean = context.getBean("myBean", MyBean.class);
//        System.out.println(myBean);

        //工厂bean，配置文件中返回类型是 MyBean，但实体类实现了工厂bean，可以返回特定的类型
        Stu myBean = context.getBean("myBean", Stu.class);
        System.out.println(myBean); //Stu{courses=[1, 2], list=null, maps=null, sets=null}
    }

    //自动装配
    @Test
    public void testBean3() {
        //1、解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2、获取配置文件创建的对象
        Teacher teacher = context.getBean("teacher", Teacher.class);

        System.out.println(teacher);
    }
}
