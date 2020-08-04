package io.github.th3c0d3r.Backend.service;

import io.github.th3c0d3r.Backend.converter.UserConverter;
import io.github.th3c0d3r.Backend.dto.UserDto;
import io.github.th3c0d3r.Backend.entity.User;
import io.github.th3c0d3r.Backend.repository.UserRepository;
import lombok.AllArgsConstructor;
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

        if (userDto.getEmail().isEmpty() || userDto.getFirstName().isEmpty() || userDto.getPassword().isEmpty()){
            throw new WebServiceException("Name, Email and password are mandatory.");
        }
        List<User> users = userRepository.findUserByFilter(UserDto.builder().email(userDto.getEmail()).build());
        if (!users.isEmpty()){
            throw new WebServiceException("Email already exist. Try signing in.");
        }

        User user = userConverter.convertDtoToModel(userDto);
        return userConverter.convertModelToDto(userRepository.save(user));
    }
}
