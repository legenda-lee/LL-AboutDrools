package com.legenda.lee.studydrools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Legenda-Lee
 * @date 2019-12-26 16:29
 * @description
 * @since 1.0.0
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "Hello World";
    }

}
