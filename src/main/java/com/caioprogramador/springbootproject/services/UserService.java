package com.caioprogramador.springbootproject.services;


import com.caioprogramador.springbootproject.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User insert(User user);
    User update(User user, Long id);
    void deleteById(Long id);

}
