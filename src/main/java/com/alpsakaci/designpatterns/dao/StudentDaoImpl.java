package com.alpsakaci.designpatterns.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
//	consider the list as database
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Alp", 0);
		Student student2 = new Student("Bugra", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student " + student.getRollNo() + " updated.");

	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student " + student.getRollNo() + "deleted.");
	}

}
