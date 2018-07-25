package com.alkx.java.spi.test;

import com.alkx.java.spi.api.IUserService;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class TestSPI {
    public static void main(String[] args) {
        //获取所有实现IUservice接口的SPI（Service provider Interfaces）
        ServiceLoader<IUserService> serviceLoader = ServiceLoader.load(IUserService.class);
        Iterator<IUserService> iUserServiceIterator = serviceLoader.iterator();
        //遍历调用服务
        while (iUserServiceIterator.hasNext()) {
            IUserService userService = iUserServiceIterator.next();
            userService.sayHello();
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
