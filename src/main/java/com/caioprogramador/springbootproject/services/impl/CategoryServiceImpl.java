package com.caioprogramador.springbootproject.services.impl;

import com.caioprogramador.springbootproject.entities.Category;
import com.caioprogramador.springbootproject.entities.Order;
import com.caioprogramador.springbootproject.repositories.CategoryRepository;
import com.caioprogramador.springbootproject.repositories.OrderRepository;
import com.caioprogramador.springbootproject.services.CategoryService;
import com.caioprogramador.springbootproject.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: "+ id));
    }

    @Override
    public Category insert(Category user) {
        return null;
    }

    @Override
    public Category update(Category user, Long id) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
