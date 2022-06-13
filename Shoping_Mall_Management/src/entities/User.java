package entities;

import java.io.Serializable;

@Entity
@Table(name="User")
public class User implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="userId")
	private int id;
	@Column(name="userName")
	private String name;
	@Column(name="Type")
	private String type;
	@Column(name="Password")
	private String password;
	public User() {
		super();
		
	}
	public long getId() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	
	
}