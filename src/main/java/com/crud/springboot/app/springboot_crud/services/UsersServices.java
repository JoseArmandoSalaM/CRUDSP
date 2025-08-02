package com.crud.springboot.app.springboot_crud.services;

import java.util.List;

import com.crud.springboot.app.springboot_crud.DTO.UserDTO;
import com.crud.springboot.app.springboot_crud.entities.User;

public interface UsersServices {

    List<UserDTO> findAll();

    User save(User user);

    boolean existsByUsername(String username);

}
