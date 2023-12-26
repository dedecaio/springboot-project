package com.caioprogramador.springbootproject.services;

import com.caioprogramador.springbootproject.entities.Order;
import com.caioprogramador.springbootproject.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    Product insert(Product product);
    Long deleteById(Long id);
    Product update(Product product, Long id);
}
