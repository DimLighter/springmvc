package com.hhg.jerry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
