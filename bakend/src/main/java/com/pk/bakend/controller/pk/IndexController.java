package com.pk.bakend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    String Index(){
        return "pk/index.html";
    }
}
