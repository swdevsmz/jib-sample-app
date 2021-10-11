package com.example.jibsampleapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public ModelAndView get(ModelAndView mav) {
        mav.setViewName("index");
        log.info("IndexController Access");
        return mav;
    }
}
