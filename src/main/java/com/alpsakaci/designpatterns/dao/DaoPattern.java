package com.alpsakaci.designpatterns.dao;

public class DaoPattern {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		for(Student student : studentDao.getAllStudents()) {
			System.out.println(student);
		}
		
		Student student = studentDao.getStudent(0);
		student.setName("Eren Alp");
		studentDao.updateStudent(student);
		
		System.out.println(studentDao.getStudent(0));
	}

}
