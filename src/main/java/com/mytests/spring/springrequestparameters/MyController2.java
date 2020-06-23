package com.mytests.spring.springrequestparameters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *
 * <p>Created by irina on 22.06.2020.</p>
 * <p>Project: spring-requestparameters</p>
 * *
 */
@Controller
public class MyController2 {

    @RequestMapping(path="/some_url")
    public String sameUrlByParams1(@RequestParam(name=MyConstants.P21) String p1, @RequestParam String param22,
                                  Model map) {
        map.addAttribute("msg", "constant param21: " + p1+" and dummy p2: "+ param22);
        return "my-page2";
    }
    @RequestMapping(path="/some_url2")
    public String sameUrlByParams2(@RequestParam(name="param23") String p1, @RequestParam(value = "") String param24, @RequestParam(value="param25") String p3,
                                  Model map) {
        map.addAttribute("msg", "constant param23: " + p1+", param24: "+ param24+", param25: "+ p3);
        return "my-page2";
    }
}
