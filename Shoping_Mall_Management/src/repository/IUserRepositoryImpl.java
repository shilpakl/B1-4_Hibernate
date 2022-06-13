package repository;

import entities.User;

public class IUserRepositoryImpl implements IUserRepository
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	public IUserRepositoryImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}
	//Update operation
	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}
	//Delete operation
	@Override
	public void deleteUser(long id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}
	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
