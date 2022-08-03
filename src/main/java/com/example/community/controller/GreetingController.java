package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting") //这个网页的名称，跳转等需要用到/greeting
    public String greeting(@RequestParam(name="name",required = false,defaultValue = "World") String name,Model model){
        model.addAttribute("name",name);
        return "greeting"; //方法参数name等映射的html文件

    }
}
