package com.caioprogramador.springbootproject.services.impl;

import com.caioprogramador.springbootproject.entities.User;
import com.caioprogramador.springbootproject.repositories.UserRepository;
import com.caioprogramador.springbootproject.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: "+ id));
    }

    @Override
    public User insert(User user) {
       return userRepository.save(user);
    }

    @Override
    public User update(User user, Long id) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
