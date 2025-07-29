package com.crud.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.springboot.app.springboot_crud.entities.Courses;
import com.crud.springboot.app.springboot_crud.repositories.CoursesRepository;

@Service
public class CoursesServicesImpl implements CoursesServices {

    private final CoursesRepository coursesRepository;

    public CoursesServicesImpl(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @Transactional
    @Override
    public Optional<Courses> findById(Integer id) {
        return coursesRepository.findById(id);
    }

    @Override
    public List<Courses> findAll() {
        return (List<Courses>) coursesRepository.findAll();
    }

}
