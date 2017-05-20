package com.pony_self_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author: qiaoyi
 * @edit:
 * @created:17/2/23
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {


    @RequestMapping(value = {"", "/", "index"}, method = RequestMethod.GET)
    String index(Model model) {
        return "index";
    }
}