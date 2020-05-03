package com.zhang.service;

import org.junit.Test;

public class TestUserService {
    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
