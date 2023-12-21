package com.caioprogramador.springbootproject.repositories;

import com.caioprogramador.springbootproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
