package com.example.BusHop.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusHop.Models.User;
import com.example.BusHop.Repository.userRepositoryInterface;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	private userRepositoryInterface us;
	
	@PostMapping("/user/registration")
	public User addUser(@RequestBody User user) {
		return us.save(user);
	}
	
	@GetMapping("/user/login/{id}")
	public String getpassword(@PathVariable("id")Long id) {
		@SuppressWarnings("deprecation")
		User user=us.getById(id);
		
		String pass=user.getUserPassword();
		return pass;
	}
	
}
