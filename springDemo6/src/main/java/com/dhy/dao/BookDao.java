package com.dhy.dao;

import com.dhy.model.User;

import java.util.List;

public interface BookDao {
    int insert(String name,int age);

    //查询返回对象
    User getUserInfo(int id);

    //查询返回对象集合
    List<User> getUserInfoList();

    //批量添加
    void batchAdd(List<Object[]> list);
}
