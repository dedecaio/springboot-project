package com.caioprogramador.springbootproject.repositories;

import com.caioprogramador.springbootproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
