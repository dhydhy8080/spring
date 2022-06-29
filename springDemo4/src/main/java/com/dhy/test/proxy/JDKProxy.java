package com.dhy.test.proxy;

import com.dhy.test.dao.UserDao;
import com.dhy.test.dao.UserDaoImpl;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {

        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        UserDao o = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(new UserDaoImpl()));

        int result1 = o.add(1,2);
        System.out.println("result1 = "+result1);
        int result2 = o.sub(1,2);
        System.out.println("result2 = "+result2);
    }

}
