package com.example.demo.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Students;
import com.example.demo.repo.StudentDAO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@ManagedBean  @Getter  @Setter @RequiredArgsConstructor @Slf4j
@Scope(value = "session")
@Component(value = "studentController")
public class StudentController {
	private final StudentDAO studentDAO;
	private List<Students> students;
	private Students student = new Students();

	public void saveStudent() {
		studentDAO.save(student);
		log.info("student {} added to database" , student.getName());
		student = new Students();
	}


	public List<Students> getStudents() {
		students = studentDAO.findAll();
		log.info("retrieved all students from database");
		return students;
	}
}
