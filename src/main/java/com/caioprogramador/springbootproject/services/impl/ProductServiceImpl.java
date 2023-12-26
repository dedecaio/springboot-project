package com.caioprogramador.springbootproject.services.impl;

import com.caioprogramador.springbootproject.entities.Product;
import com.caioprogramador.springbootproject.repositories.ProductRepository;
import com.caioprogramador.springbootproject.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product with id "+id+" does not exists"));
    }

    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }

    @Override
    public Product update(Product product, Long id) {
        return null;
    }
}
