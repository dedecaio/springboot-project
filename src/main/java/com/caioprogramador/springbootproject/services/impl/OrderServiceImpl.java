package com.caioprogramador.springbootproject.services.impl;

import com.caioprogramador.springbootproject.entities.Order;
import com.caioprogramador.springbootproject.repositories.OrderRepository;
import com.caioprogramador.springbootproject.repositories.UserRepository;
import com.caioprogramador.springbootproject.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: "+ id));
    }

    @Override
    public Order insert(Order order) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }


    @Override
    public Order update(Order order, Long id) {
        return null;
    }

}
