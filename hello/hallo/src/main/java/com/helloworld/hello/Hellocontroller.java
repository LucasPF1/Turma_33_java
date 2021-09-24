package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

    public class Hellocontroller {

      @GetMapping
	    public String Hello() {
    	  return "Ola mundo !!!! ";
      }
        

}
