package com.example.BusHop.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusHop.Models.Bus;
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
	
	@PutMapping("/user/update/{id}")
	public User profileUpdate(@PathVariable("id")Long id,@RequestBody User user) {
		User setUser=us.findById(id).orElseThrow();
		setUser.setUserPassword(user.getUserPassword());
		setUser.setUserEmail(user.getUserEmail());
		setUser.setAge(user.getAge());
		setUser.setGender(user.getGender());
		setUser.setUserName(user.getUserName());
		
		return us.save(setUser);
	}
	
	@GetMapping("/user/login/{id}")
	public String getpassword(@PathVariable("id")Long id) {
		@SuppressWarnings("deprecation")
		User user=us.getById(id);
		
		String pass=user.getUserPassword();
		return pass;
	}
	
	@GetMapping("/admin/user")
	public List<User> getAllUser(){
		return us.findAll();
	}
	
}
