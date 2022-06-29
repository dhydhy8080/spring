package com.dhy.spring5;

public class Order {
    private String name;
    private double price;

    //有参构造，bean1.xml在被解析时，需要用constructor-arg配置
    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
