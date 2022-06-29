package com.dhy.spring5.service;

import com.dhy.spring5.dao.UserDao;

/*
* 想要在这个类中，使用userDao的update()方法，不用传统new对象的方法，而是使用配置文件的方法
* */
public class UserService {

    //创建UserDao类型属性，生成set方法
    //这个和其它类创建属性值，是一个原理，把它当作一个类中的属性就行，于是它也有set方法等
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.....");
        userDao.update();
    }
}
