package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
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
	public User updateUser(@RequestBody User user) {
		return usersService.updateUser(user);
	}

	@DeleteMapping
	public void deleteUser(@RequestBody User user) {
		usersService.deleteUser(user);
	}
}
