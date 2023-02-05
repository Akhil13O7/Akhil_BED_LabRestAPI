package com.gl.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.studentmanagement.entity.Student;
import com.gl.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student saveStudent(Student stud) {
		return this.studentRepository.save(stud);
	}

	public void deleteStudentById(int studId) {
		this.studentRepository.deleteById(studId);
	}

	public Student updateStudent(Student student) {
		return this.studentRepository.save(student);
	}

	public Student fetchStudentById(int studId) {
		return this.studentRepository.getById(studId);
	}

	public List<Student> fetchAllStudent() {
		return this.studentRepository.findAll();
	}

}
