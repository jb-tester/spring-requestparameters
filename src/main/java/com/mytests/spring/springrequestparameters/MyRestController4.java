package com.mytests.spring.springrequestparameters;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/rest4")
public class MyRestController4 {

  @RequestMapping (path = "/p1", method = {RequestMethod.POST})
  public String handle(@RequestBody() String rb) {
      return "";
  }

    @PostMapping("/p2")
    public String create(@RequestPart("doc") String doc,
                           @RequestPart(name = "file",required = false) MultipartFile file) {
        
        return "";
    }

    
}