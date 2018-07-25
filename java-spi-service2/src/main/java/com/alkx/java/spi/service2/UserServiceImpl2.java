package com.alkx.java.spi.service2;

import com.alkx.java.spi.api.IUserService;

public class UserServiceImpl2 implements IUserService {
    @Override
    public void sayHello() {
        System.out.println("service2");
    }
}
