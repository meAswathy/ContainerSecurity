package com.conainer.security.api.controller;

import com.conainer.security.api.model.User;
import com.conainer.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/getAllUsers")
    private List<User> getAllUsers(){
        //System.out.println("00000000000000000000000");
        List<User> users = userService.getUserList();
        if(users.size()!=0){
            return users;
        }
        return null;
    }
    @GetMapping("/user/{id}")
    private User getUser(@RequestParam Integer id){
        //System.out.println("11111111111111111111111111111111");
        Optional user = userService.getUser(id);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
    }
    @GetMapping("/")
    public String Greeting(){
        return "Hello, Aswathy here!!";
    }
}
