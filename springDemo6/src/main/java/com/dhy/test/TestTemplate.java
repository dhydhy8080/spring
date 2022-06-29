package com.dhy.test;

import com.dhy.dao.BookDaoImpl;
import com.dhy.model.User;
import com.dhy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestTemplate {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //通过service插入
        BookService bookService = context.getBean("bookService", BookService.class);
        int gary = bookService.add("gary", 17);
        System.out.println(gary);

        //直接通过实现类插入
        BookDaoImpl bookDaoImpl = context.getBean("bookDaoImpl", BookDaoImpl.class);
        int tik = bookDaoImpl.insert("tik", 15);
        System.out.println(tik);
    }
    //查询返回对象
    @Test
    public void read() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //直接通过实现类插入
        BookDaoImpl bookDaoImpl = context.getBean("bookDaoImpl", BookDaoImpl.class);
        User userInfo = bookDaoImpl.getUserInfo(2);
        System.out.println(userInfo);
    }

    //查询返回对象集合
    @Test
    public void readList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //直接通过实现类插入
        BookDaoImpl bookDaoImpl = context.getBean("bookDaoImpl", BookDaoImpl.class);
        List<User> userInfoList = bookDaoImpl.getUserInfoList();
        System.out.println(userInfoList);
    }

    //批量添加对象
    @Test
    public void batchAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //直接通过实现类插入
        BookDaoImpl bookDaoImpl = context.getBean("bookDaoImpl", BookDaoImpl.class);
        List<Object[]> list = new ArrayList<>();

        Object[] o1 = {null,"gard",16};
        Object[] o2 = {null,"richard",18};
        list.add(o1);
        list.add(o2);
        bookDaoImpl.batchAdd(list);
    }
}
