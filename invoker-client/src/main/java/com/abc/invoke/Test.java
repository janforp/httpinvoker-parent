package com.abc.invoke;


import com.abc.invoke.client.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.invoke.bean.User;

/**
 * Created by Janita on 2017-03-23 19:43
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("classpath:client-application-context.xml");
        IUserService service = (IUserService)ac.getBean("userService");
        User u = service.getUserByName("Janita");
        System.out.println(u);
    }
}
