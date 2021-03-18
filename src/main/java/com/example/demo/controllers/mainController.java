package com.example.demo.controllers;

import com.example.demo.objects.Cache;
import com.example.demo.objects.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
    Cache chache = new Cache();
    User user = new User();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String getUserData(@RequestParam("userId") int userId) throws InterruptedException {
        if (chache.has(userId)) {
            return chache.get(userId);
        } else {
            chache.set(userId, user.getDataSlow());
            return chache.get(userId);
        }
    }
}