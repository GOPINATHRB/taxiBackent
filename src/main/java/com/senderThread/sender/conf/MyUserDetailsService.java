package com.senderThread.sender.conf;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyUserDetailsService implements UserDetailsService {

    // This example uses an in-memory store, but you might use a database or another service
    private static final Map<String, String> users = new HashMap<>();




    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Method to register a new user
    public void registerUser(String username) {
        String encodedPassword = passwordEncoder.encode("gopinath");
        users.put(username, encodedPassword);
    }




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = users.get(username);
        if (password == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return User
                .withUsername(username)
                .password( password) // {noop} for plain text password
                .roles("USER")
                .build();
    }
}
