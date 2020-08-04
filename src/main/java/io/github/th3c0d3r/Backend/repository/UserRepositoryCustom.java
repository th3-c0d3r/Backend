package io.github.th3c0d3r.Backend.repository;

import io.github.th3c0d3r.Backend.dto.UserDto;
import io.github.th3c0d3r.Backend.entity.User;

import java.util.List;

public interface UserRepositoryCustom {

    public List<User> findUserByFilter(UserDto userDto);
}
