package com.example.springboot.lessonone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot HelloWorld
 * @author peiqy
 *
 */
@RestController
@RequestMapping
public class HelloWorldController {

    /**
     * HelloWorld
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "HelloWorld!!!";
    }
}
