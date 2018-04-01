package com.aharkunov.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AKharkunov on 26.03.2018.
 */

@RestController
@EnableAutoConfiguration
public class SearchController {

    @RequestMapping("/search")
    public String index(@RequestParam(value="string") String str)
    {
        return "upload";
    }


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

}
