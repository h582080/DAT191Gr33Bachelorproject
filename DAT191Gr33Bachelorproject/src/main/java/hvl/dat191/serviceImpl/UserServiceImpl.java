package hvl.dat191.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.UserDAO;
import hvl.dat191.model.User;
import hvl.dat191.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO ud;
	
	@Override
	public List<User> findAllUser() {
		return ud.findAllUser();
	}

	@Override
	public void insertUser(User user) {
		ud.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		ud.updateUser(user);
	}

	@Override
	public void executeUpdateUser(User user) {
		ud.executeUpdateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		ud.deleteUser(user);
	}

}
