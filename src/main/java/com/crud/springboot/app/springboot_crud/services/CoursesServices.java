package com.crud.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.crud.springboot.app.springboot_crud.entities.Courses;

public interface CoursesServices {

    Optional<Courses> findById(Integer id);

    List<Courses> findAll();

}
