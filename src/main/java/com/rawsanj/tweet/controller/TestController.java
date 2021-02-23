package com.rawsanj.tweet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping("/test1")
    public String hello(Model model){
        model.addAttribute("message", "hello from the controller !!!");
        return "search";
    }

//    @RequestMapping("/test12/")
//    public String hello2(@RequestParam("name") String userName, Model model){
//        model.addAttribute("message", "hello,  " + userName);
//        return "resultPage";
//    }
//}
}
