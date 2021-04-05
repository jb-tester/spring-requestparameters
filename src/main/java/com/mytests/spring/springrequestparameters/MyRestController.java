package com.mytests.spring.springrequestparameters;

import org.springframework.web.bind.annotation.*;

/**
 * *
 * <p>Created by irina on 05.04.2021.</p>
 * <p>Project: spring-requestparameters</p>
 * *
 */
@RestController
@RequestMapping("/rest")
public class MyRestController {
    
    // OpenAPI for @RequestHeader and @RequestParam w/u explicit value/name attributes
    @GetMapping(path={"/p1"})
    public String p1(@RequestParam String rp1, @RequestHeader String rh1) {
        
        return "p1";
    }  
    
    // OpenAPI for @RequestMapping#headers
     @GetMapping(path={"/p2"}, headers = {"h1=h1_value","h2=h2_value"})
    public String p2() {
        
        return "p2";
    }

    // OpenAPI for @RequestMapping without explicit method
       @RequestMapping(value = "/p3")
        public String p3(@RequestParam(name = "param1") String rp, @RequestHeader(value = "myheader1") String rh){
          return "p3";
        }
    // OpenAPI for default values for @RequestParam and @RequestHeader
    @GetMapping("/p4")
    public String p4(@RequestParam(name = "param1", defaultValue = "param1_value") String rp, @RequestHeader(value = "myheader1", defaultValue = "header1_value") String rh){
        return "p4";
    }
}
