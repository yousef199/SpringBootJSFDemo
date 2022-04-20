package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Students;

public interface StudentDAO extends JpaRepository<Students, Integer>{

}
