package io.github.th3c0d3r.Backend.controller;

import io.github.th3c0d3r.Backend.dto.UserDto;
import io.github.th3c0d3r.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/signup")
    public UserDto signUp(@RequestBody UserDto userDto){
        return userService.signUp(userDto);
    }
}
