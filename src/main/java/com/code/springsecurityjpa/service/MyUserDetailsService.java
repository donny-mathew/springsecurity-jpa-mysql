package com.code.springsecurityjpa.service;

import com.code.springsecurityjpa.dao.UserRepository;
import com.code.springsecurityjpa.model.MyUserDetails;
import com.code.springsecurityjpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =userRepository.findByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found: "+username));
        return user.map(MyUserDetails::new).get();
    }
}
