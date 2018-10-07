package com.hhg.jerry.controller;

import com.hhg.jerry.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by lina on 2018/10/7.
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //called before mapping method
    @ModelAttribute
    public void modelAtt1(@RequestParam(required = false) String rp, Model model){
        logger.info("rp is :" + rp);
        model.addAttribute("rp", rp);
    }

    @ModelAttribute(value = "returnUser")
    public User modelAtt2(){
        User user = new User();
        user.setName("ted");
        user.setAge(18);
        logger.info("user : {}" , user);
        return user;
    }

    @RequestMapping("/test")
    @ModelAttribute("mm")
    public String modelAttribute(){
        return "test";
    }

    @RequestMapping("/direct")
    public String direct(String name, Integer age){
        logger.info("name is {}, age is {}", name, age);
        return "test";
    }

    @RequestMapping("/user")
    public String user(User user){
        logger.info("name is {}, age is {}", user.getName(), user.getAge());
        return "test";
    }

    @RequestMapping("/user/{id}")
    public String path(@PathVariable Long id){
        logger.info("id is {}", id);
        return "test";
    }

    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request, HttpServletResponse response){
        logger.info("name is {}, age is {}", request.getParameter("name"),
                request.getParameter("age"));
        return "test";
    }

    @RequestMapping("/model")
    public String model(Map<String, Object> map, Model model, ModelMap modelMap){
        map.put("map", "I'm a map");
        model.addAttribute("model", "I'm a model");
        modelMap.addAttribute("modelMap", "I'm a modelmap");
        return "test";
    }
}
