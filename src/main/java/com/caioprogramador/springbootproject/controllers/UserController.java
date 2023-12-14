package com.caioprogramador.springbootproject.controllers;

import com.caioprogramador.springbootproject.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Neymar", "neymar@gmail.com", "99999999","12345");
        return ResponseEntity.ok(u);
    }
}
