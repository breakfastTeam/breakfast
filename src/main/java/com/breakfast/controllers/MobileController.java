package com.breakfast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kkk on 14/11/19.
 */
@Controller
@RequestMapping("/mobile")
public class MobileController {


    @RequestMapping({"/index","/"})
    public String index(){
        return "index";
    }

}
