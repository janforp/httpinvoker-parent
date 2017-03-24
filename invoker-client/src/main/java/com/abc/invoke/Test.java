package com.abc.invoke;


import com.abc.invoke.client.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.invoke.bean.User;

/**
 * Created by Janita on 2017-03-23 19:43
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath:application-context.xml");
        UserService service = (UserService)ac.getBean("userService");
        User u = service.getUserByName("Alvis");
        System.out.println(u);
    }
}
