package com.dhy.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("原本的加法执行了");
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("原本的减法执行了");
        return a - b;
    }
}

