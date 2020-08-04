package io.github.th3c0d3r.Backend.converter;

import io.github.th3c0d3r.Backend.dto.UserDto;
import io.github.th3c0d3r.Backend.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserDto convertModelToDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .email(user.getEmail())
                .gender(user.getGender())
                .build();
    }

    public User convertDtoToModel(UserDto userDto){
        return User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .encryptedPassword(userDto.getPassword())
                .active(userDto.getActive())
                .build();
    }
}
