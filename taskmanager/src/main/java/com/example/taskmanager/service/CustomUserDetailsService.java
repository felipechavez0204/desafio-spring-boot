package com.example.taskmanager.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.taskmanager.model.User;
import com.example.taskmanager.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	 private final UserRepository userRepository;

	    public CustomUserDetailsService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepository.findByUsername(username)
	            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

	        return new org.springframework.security.core.userdetails.User(
	            user.getUsername(),
	            user.getPassword(),
	            List.of(new SimpleGrantedAuthority("ROLE_USER")) // Rol de usuario
	        );
	    }
}