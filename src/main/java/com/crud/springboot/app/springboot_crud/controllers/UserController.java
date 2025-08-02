package com.crud.springboot.app.springboot_crud.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.springboot.app.springboot_crud.DTO.UserDTO;
import com.crud.springboot.app.springboot_crud.entities.User;
import com.crud.springboot.app.springboot_crud.services.UsersServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsersServices usersServices;

    public UserController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @GetMapping
    public List<UserDTO> list() {
        return usersServices.findAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody User user, BindingResult result) {

        if (result.hasFieldErrors()) {
            return validation(result);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(usersServices.save(user));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody User user, BindingResult result) {
        user.setAdmin(false);
        return create(user, result);
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> error = new HashMap<>();

        result.getFieldErrors().forEach(e -> {
            error.put(e.getField(), "El campo " + e.getField() + " " + e.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(error);
    }

}
