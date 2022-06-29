package com.j2ee.tdspring.controllers;

import com.j2ee.tdspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.j2ee.tdspring.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/{username}", method = RequestMethod.GET)
    public User get(@PathVariable(name = "username") String username) {
        return userService.getUserById(username);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User createOrUpdate(@RequestBody User user) {
        return userService.createOrUpdate(user);
    }

}