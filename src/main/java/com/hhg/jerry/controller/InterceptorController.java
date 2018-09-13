package com.hhg.jerry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lining on 2018/9/13.
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/test1")
    public ModelAndView interceptor(){
        System.out.println(this.getClass().getSimpleName() + " " + new Exception().getStackTrace()[0].getMethodName() + " enter");
        return new ModelAndView("interceptor");
    }
}
