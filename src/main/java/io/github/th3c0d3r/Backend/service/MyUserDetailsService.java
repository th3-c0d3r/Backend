package io.github.th3c0d3r.Backend.service;

import io.github.th3c0d3r.Backend.dto.UserDto;
import io.github.th3c0d3r.Backend.entity.User;
import io.github.th3c0d3r.Backend.repository.UserRepository;
import io.github.th3c0d3r.Backend.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        List<User> userList = userRepository.findUserByFilter(UserDto.builder().email(userName).build());
        if (userList.isEmpty()){
            throw new UsernameNotFoundException("No user found with that EmailId");
        }

        return new UserPrincipal(userList.get(0));
    }
}
