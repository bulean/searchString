package com.aharkunov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by AKharkunov on 29.03.2018.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "upload";
    }

}
