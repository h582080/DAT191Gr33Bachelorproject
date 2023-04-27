package hvl.dat191.controllerTests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.User;
import hvl.dat191.service.UserService;

@RestController
@RequestMapping("/userApp")
public class UserController {

	@Autowired
	private UserService us;
	
	@GetMapping("/userList")
	public List<User> findAllUser() {
		return us.findAllUser();
	}

	@PostMapping("/createUser")
	public void insertUser(@RequestBody User user) {
		us.insertUser(user);
	}

	@PutMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		us.updateUser(user);
	}

	@PutMapping("/executeUpdateUser")
	public void executeUpdateUser(@RequestBody User user) {
		us.executeUpdateUser(user);
	}

	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody User user) {
		us.deleteUser(user);
	}
}
