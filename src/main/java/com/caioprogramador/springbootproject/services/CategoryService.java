package com.caioprogramador.springbootproject.services;

import com.caioprogramador.springbootproject.entities.Category;

import java.util.List;

public interface CategoryService{
    List<Category> findAll();
    Category findById(Long id);
    Category insert(Category user);
    Category update(Category user, Long id);
    Long deleteById(Long id);
}
