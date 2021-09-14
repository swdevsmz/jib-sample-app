package com.example.jibsampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {

    @GetMapping("/")
    public ModelAndView get(ModelAndView mav) {
        mav.setViewName("index");
        return mav;
    }
}
