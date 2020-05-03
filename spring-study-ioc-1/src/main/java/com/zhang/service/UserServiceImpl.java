package com.zhang.service;

import com.zhang.dao.UserDao;
import com.zhang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}
