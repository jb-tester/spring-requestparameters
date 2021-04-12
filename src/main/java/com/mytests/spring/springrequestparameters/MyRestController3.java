package com.mytests.spring.springrequestparameters;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest3")
public class MyRestController3 {

 
  
  // ResponseStatus
  @ResponseStatus(value= HttpStatus.I_AM_A_TEAPOT)  
  @GetMapping("/p1")
  public String p1() {
    return "p1";
  }

  // PathVariable with prefix/suffix in the same fragment
  @GetMapping("/p2/foo{bar}boo/")
  public String p2(@PathVariable String bar) {
    return "p2";
  }
  
}