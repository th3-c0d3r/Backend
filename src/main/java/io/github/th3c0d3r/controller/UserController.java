package io.github.th3c0d3r.controller;

import io.github.th3c0d3r.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @PostMapping(path = "/signup")
    public UserDto signUp(){

    }
}
