package io.github.th3c0d3r.converter;

import io.github.th3c0d3r.dto.UserDto;
import io.github.th3c0d3r.entity.User;

public class UserConverter {

    public UserDto convertModelToDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .FirstName(user.getFirstName())
                .LastName(user.getLastName())
                .Age(user.getAge())
                .Email(user.getEmail())
                .Gender(user.getGender())
                .build();
    }

    public User convertDtoToModel(UserDto userDto){
        return User.builder()
                .FirstName(userDto.getFirstName())
                .LastName(userDto.getLastName())
                .build();
    }
}
