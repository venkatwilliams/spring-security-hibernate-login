package com.venkat.auth.service;

import com.venkat.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
