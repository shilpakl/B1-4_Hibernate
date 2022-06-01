package inheritance2;
import java.io.Serializable;


@Entity
@Table(name="EMP_STORE2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empID;
	private String name;
	private double salary;
	public int getEmpID() 
	{
		return empID;
	}
	public void setEmpID(int empID) 
	{
		this.empID = empID;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	

}