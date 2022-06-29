package com.dhy.test.aspectJ;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
        System.out.println("add......");
    }

    public void sub() {
        System.out.println("sub......");
    }
}
