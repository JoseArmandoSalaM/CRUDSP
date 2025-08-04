package com.crud.springboot.app.springboot_crud.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.springboot.app.springboot_crud.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, String> {

    boolean existsByUsername(String username);

    Optional<User> findByUser(String username);

}
