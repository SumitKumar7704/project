package com.example.kanbanboard.service;

import com.example.kanbanboard.domain.User;

public interface AuthService {
    User register(User user);
    String login(String email, String password);
}
