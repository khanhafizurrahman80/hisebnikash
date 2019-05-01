package com.example.spring.learning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "I am at the index page!";
    }



}
