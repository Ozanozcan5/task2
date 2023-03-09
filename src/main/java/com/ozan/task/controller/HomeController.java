package com.ozan.task.controller;

import com.ozan.task.model.UserDetail;
import com.ozan.task.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
public class HomeController {
    @Autowired
    private UserService userService;


    @GetMapping("/signin")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/createUser")
    public void createuser(@RequestBody UserDetail user) {

        // System.out.println(user);

        boolean f = userService.checkEmail(user.getEmail());

            UserDetail userDetail = userService.createUser(user);


    }
}
