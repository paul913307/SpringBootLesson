package com.example.springboot.lessontwo;

import com.example.springboot.lessontwo.domain.User;
import com.example.springboot.lessontwo.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author peiqy
 * Date 2018-06-29
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserJpa userJpa;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Collection<User> list(){
        return userJpa.findAll();
    }

}
