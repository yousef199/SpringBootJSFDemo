package com.example.demo.managedbeans;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Students;
import com.example.demo.repo.StudentDAO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Scope (value = "session")
@Component (value = "studentList")
public class StudentListController {
	private final StudentDAO studentDAO;
	private List<Students> studentsList;
	
	public List<Students> getStudentsList() {
		studentsList = studentDAO.findAll();
		return studentsList;
	}
}
