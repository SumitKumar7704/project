package com.example.kanbanboard.config;

import com.example.kanbanboard.domain.User;
import com.example.kanbanboard.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository repo;

    public CustomUserDetailsService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return new UserDetailsImpl(user);
    }
}
