package com.crud.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crud.springboot.app.springboot_crud.entities.Course;

public interface CoursesRepository extends CrudRepository<Course, Integer> {

}
