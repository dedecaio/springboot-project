package com.caioprogramador.springbootproject.repositories;

import com.caioprogramador.springbootproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
