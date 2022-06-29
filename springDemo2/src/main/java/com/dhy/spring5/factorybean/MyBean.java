package com.dhy.spring5.factorybean;

import com.dhy.spring5.collectionType.Stu;
import org.springframework.beans.factory.FactoryBean;

/*
* 测试工厂bean
* */
public class MyBean implements FactoryBean<Stu> {

    public Stu getObject() throws Exception {
        Stu stu = new Stu();
        stu.setCourses(new String[]{"1", "2"});
        return stu;
    }

    public Class<?> getObjectType() {
        return null;
    }

}
