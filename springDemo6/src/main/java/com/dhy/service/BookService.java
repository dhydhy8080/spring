package com.dhy.service;

import com.dhy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public int add(String name,int age) {
        return bookDao.insert(name,age);
    }
}
