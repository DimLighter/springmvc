package com.hhg.jerry.controller;

import com.hhg.jerry.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lining on 2018/9/5.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String index(){
        return "test";
    }

    @RequestMapping("/user")
    @ResponseBody
    public User user(String name, Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/user1")
    @ResponseBody
    public User user(User user){
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User user(@PathVariable("id") Long id){
        User user = new User();
        user.setId(id);
        user.setName("dummy");
        user.setAge(0);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public String json(String json){
        return json;
    }
}
