package com.mytests.spring.springrequestparameters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *******************************
 * <p>Created by irina on 17.06.2020.</p>
 * <p>Project: spring-requestparameters</p>
 * *******************************
 */
@Controller
public class MyController1 {
    @RequestMapping(path="/same_url",params = "param1")
    public String sameUrlByParam1(@RequestParam("param1") String p1,
                                              Model map) {
        map.addAttribute("msg", "case1 - with param1: " + p1);
        return "my-page1";
    }

    @RequestMapping(path="/same_url",params = "param2")
    public String sameUrlByParam2(@RequestParam String param2, Model map) {
        map.addAttribute("msg", "case2 - with param2: " + param2);
        return "my-page1";
    }
    @RequestMapping(path="/same_url",params = "param4")
    public String sameUrlByParam4( Model map) {
        map.addAttribute("msg", "case3 - with param4 witch value doesn't matter");
        return "my-page1";
    }
    @RequestMapping(path="/same_url",params = {"param1","param2","param3"})
    public String sameUrlByAllParams(@RequestParam("param1") String p1, @RequestParam("param2") String p2,  @RequestParam("param3") String p3,
                                  Model map) {
        map.addAttribute("msg", "case4 - with params: param1 =" + p1+", param2 ="+p2+", param3 ="+p3);
        return "my-page1";
    }
    @RequestMapping(path="/same_url",params = {"param1=aaa","param2=bbb"})
    public String sameUrlByParamsWithSpecificValues(@RequestParam("param1") String p1, @RequestParam("param2") String p2,
                                     Model map) {
        map.addAttribute("msg", "case5 - with params: param1 =" + p1+", param2 ="+p2);
        return "my-page1";
    }
}
