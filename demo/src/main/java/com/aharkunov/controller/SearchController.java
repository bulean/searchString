package com.aharkunov.controller;

import com.aharkunov.util.Search;
import com.aharkunov.model.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AKharkunov on 26.03.2018.
 */

@RestController
@EnableAutoConfiguration
public class SearchController {

    @RequestMapping("/search")
    public List<Line> index(@RequestParam(value="string") String str)
    {
        return Search.searchText(str);
    }
}
