package com.xsoft.secureapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsoft.secureapp.Repository.UserRepository;
import com.xsoft.secureapp.model.User;

@Controller
@RequestMapping("/secure/auth")
public class AdminController {
	@Autowired
	private UserRepository userRepo;
	
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		return "User added successfully";
	}
	
	@GetMapping("/admin/all")
	public String secureAccess() {
		return "Secure access ..";
	}
	

	

}
