package com.waciao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sound.midi.Soundbank;

/**
 * @Author: Waciao
 * @Date: 2020/3/28
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

@Controller
public class IndexController {

    @PostMapping("/test")
    public String index(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "index";
    }
}
