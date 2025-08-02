package com.crud.springboot.app.springboot_crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.springboot.app.springboot_crud.entities.Course;
import com.crud.springboot.app.springboot_crud.services.CoursesServices;

@RestController
@RequestMapping("/app/courses")
public class CoursesController {

    private final CoursesServices coursesServices;

    public CoursesController(CoursesServices coursesServices) {
        this.coursesServices = coursesServices;
    }

    @GetMapping
    public List<Course> all() {
        return coursesServices.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Integer id) {
        Optional<Course> coursesOptional = coursesServices.findById(id);

        if (coursesOptional.isPresent()) {
            return ResponseEntity.ok(coursesOptional.orElseThrow());
        }

        return ResponseEntity.badRequest().build();
    }

}
