package service;

import entities.Student;

public abstract class StudentService 
{
	public abstract void addStudent(Student student);//create
	public abstract Student findStudentById(int id);//retrieve
	public abstract void updateStudent(Student student);//update
	public abstract void removeStudent(Student student);//delete

}
