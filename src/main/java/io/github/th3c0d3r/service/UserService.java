package io.github.th3c0d3r.service;

import io.github.th3c0d3r.converter.UserConverter;
import io.github.th3c0d3r.dto.UserDto;
import io.github.th3c0d3r.entity.User;
import io.github.th3c0d3r.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.WebServiceException;
import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;

    public UserDto signUp(UserDto userDto){

        if (userDto.getEmail().isEmpty()){
            throw new WebServiceException("Name, Email and password are mandatory.");
        }
        List<User> users = userRepository.findUserByFilter(UserDto.builder().Email(userDto.getEmail()).build());
        if (!users.isEmpty()){
            throw new WebServiceException("Email already exist. Try signing in.");
        }

        User user = userConverter.convertDtoToModel(userDto);
        return userConverter.convertModelToDto(userRepository.save(user));
    }
}
