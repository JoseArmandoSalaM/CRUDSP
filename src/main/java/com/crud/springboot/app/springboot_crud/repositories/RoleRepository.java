package com.crud.springboot.app.springboot_crud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.crud.springboot.app.springboot_crud.entities.Role;

public interface RoleRepository extends CrudRepository<Role, String> {

    Optional<Role> findByName(String name);

}
