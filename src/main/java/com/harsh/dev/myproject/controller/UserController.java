package com.harsh.dev.myproject.controller;


import com.harsh.dev.myproject.db.entity.User;
import com.harsh.dev.myproject.db.repository.UserRepository;
import com.harsh.dev.myproject.requestprocessor.UserService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    private UserService userService;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping()
    public User getUser(@RequestParam("userName") String userName){
        return userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException("No User Found : "+userName));
    }

    @PostMapping()
    public User postUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
