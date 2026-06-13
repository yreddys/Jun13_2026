package com.june13.UserController;

import com.june13.entity.User;
import com.june13.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userService.create(user);
          return "saved successfully";
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId) {
        return userService.getUser(userId);
    }
}
