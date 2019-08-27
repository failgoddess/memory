package com.csl.memory.datacenterdomain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

/**
 * 首页显示swagger接口
 */
@Controller
@ApiIgnore
class HomeController {
    @RequestMapping(value = {"/", "/swagger"})
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
