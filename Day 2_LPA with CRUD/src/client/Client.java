package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		StudentServiceImpl service = new StudentServiceImpl();

		Student student = new Student();
		//CRUD Operation
		// Create Operation
		
		student.setID(182);
		
		//change id every time
		student.setName("Niraj");
		service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(171);
		System.out.print("ID:"+student.getID());
		System.out.println(" Name:"+student.getName());
		
		// Update Operation
		student = service.findStudentById(171);
		student.setName("Niraj jha");
		service.updateStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(171);
		System.out.print("ID:"+student.getID());
		System.out.println(" Name:"+student.getName());

	}

}