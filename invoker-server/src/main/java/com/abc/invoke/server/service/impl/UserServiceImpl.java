package com.abc.invoke.server.service.impl;

import com.abc.invoke.bean.User;
import com.abc.invoke.server.service.IUserService;

/**
 * Created by Janita on 2017-03-23 19:36
 */
public class UserServiceImpl implements IUserService {

    public User getUserByName(String name) {
        User u = new User();
        u.setName(name);
        u.setEmail("abc@abc.com");
        u.setAge(20);
        return u;
    }
}
