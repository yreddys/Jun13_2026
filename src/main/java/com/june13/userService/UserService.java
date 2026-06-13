package com.june13.userService;

import com.june13.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

Map<Integer,User> users= new HashMap<>();
    public void create(User user) {
        users.put(user.getUserId(), user);
    }
}
