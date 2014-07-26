package com.searchforit.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class SampleController {  
    String message = "Hello, Spring!";  
    @RequestMapping("/hello")  
    public ModelAndView showMessage() {  
        System.out.println("From the controller");  
        return new ModelAndView("hello", "message", message);  
    }  
}  