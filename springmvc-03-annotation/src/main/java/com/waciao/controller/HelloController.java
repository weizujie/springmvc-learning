package com.waciao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Waciao
 * @Date: 2020/3/28
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello SpringMVC annotation!");
        return "index";
    }
}
