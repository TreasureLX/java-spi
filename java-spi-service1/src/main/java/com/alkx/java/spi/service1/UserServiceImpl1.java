package com.alkx.java.spi.service1;

import com.alkx.java.spi.api.IUserService;

public class UserServiceImpl1 implements IUserService {
    @Override
    public void sayHello() {
        System.out.println("service1");
    }
}
