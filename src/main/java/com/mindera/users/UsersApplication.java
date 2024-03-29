package com.mindera.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class UsersApplication {
	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	@Autowired
	private UsersService usersService;

	@GetMapping
	public List<User> getAllUsers() {
		return usersService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable Integer userId) {
		return usersService.getUser(userId);
	}

	@PostMapping
	public void createUser(@RequestBody User user) {
		usersService.createUser(user);
	}

	@PutMapping
	public void updateUser(@RequestBody User user) {
		usersService.updateUser(user);
	}

	@DeleteMapping
	public void deleteUser(@RequestBody User user) {
		usersService.deleteUser(user);
	}
}
