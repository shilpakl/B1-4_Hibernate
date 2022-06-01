package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Chotu");
		emp.setSalary(25000);
		em.persist(emp);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Shilpa");
		manager.setSalary(70000);
		manager.setDeptName("student");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("added one emp and one manager");
		em.close();
		factory.close();
		
		

	}

}
