package com.dk0312.expense_tracker.controller;

import com.dk0312.expense_tracker.model.UserEntity;
import com.dk0312.expense_tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserEntity user) {
        userService.save(user);
        return ResponseEntity.ok("User Added");
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserEntity> getUserByUsername(@PathVariable String username) {
        UserEntity user = userService.findByUsername(username);
        return ResponseEntity.ok(user);
    }
}
