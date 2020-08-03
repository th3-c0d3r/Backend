package io.github.th3c0d3r.repository;

import io.github.th3c0d3r.dto.UserDto;
import io.github.th3c0d3r.entity.User;

import java.util.List;

public interface UserRepositoryCustom {

    public List<User> findUserByFilter(UserDto userDto);
}
