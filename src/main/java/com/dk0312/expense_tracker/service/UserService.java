package com.dk0312.expense_tracker.service;

import com.dk0312.expense_tracker.model.UserEntity;
import com.dk0312.expense_tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(UserEntity user) {
        userRepository.save(user);
    }

    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
