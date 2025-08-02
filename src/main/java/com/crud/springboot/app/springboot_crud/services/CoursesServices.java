package com.crud.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.crud.springboot.app.springboot_crud.entities.Course;

public interface CoursesServices {

    Optional<Course> findById(Integer id);

    List<Course> findAll();

}
