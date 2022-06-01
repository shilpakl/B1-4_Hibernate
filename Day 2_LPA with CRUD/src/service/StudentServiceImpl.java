package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDaoImpl dao;
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
	}
	
	@Override
	public void addStudent(Student student)
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	
	@Override
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
		
	}
	
	@Override
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}
	
	@Override
	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	
}