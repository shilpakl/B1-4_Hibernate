package entities;

import java.io.Serializable;

@Entity
@Table(name="Employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="empId")
	private int id;
	@Column(name="empName")
	private String name;
	@Column(name="dob")
	private String dob;
	@Column(name="Salary")
	private float salary;
	@Column(name="empAddress")
	private String address;
	@Column(name="Designation")
	private String designation;
	@Column(name="ShopID")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "shop_id")
	private Shop shop;
	private int shop_id;
	public Employee() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + ", shop_id=" + shop_id + "]";
	}
	
}