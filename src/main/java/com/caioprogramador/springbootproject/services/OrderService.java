package com.caioprogramador.springbootproject.services;

import com.caioprogramador.springbootproject.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    Order insert(Order order);
    Long deleteById(Long id);
    Order update(Order order, Long id);

}
