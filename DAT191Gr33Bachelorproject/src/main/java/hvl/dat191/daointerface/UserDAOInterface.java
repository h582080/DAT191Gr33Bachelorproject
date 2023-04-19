package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.User;

public interface UserDAOInterface {
	
List<User> findAllUser();
	
	void insertUser(User user);
	
	void updateUser(User user);
	
	void executeUpdateUser(User user);
	
	public void deleteUser(User user);

}
