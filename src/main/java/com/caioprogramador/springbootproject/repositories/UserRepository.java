package com.caioprogramador.springbootproject.repositories;

import com.caioprogramador.springbootproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
