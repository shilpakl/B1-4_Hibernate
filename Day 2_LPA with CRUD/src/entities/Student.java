package entities;

import java.io.Serializable;

@Entity
@Table(name="Student3")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int ID;
	private String Name;
	public int getID()
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	
	

}