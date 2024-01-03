package com.caioprogramador.springbootproject.repositories;

import com.caioprogramador.springbootproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
