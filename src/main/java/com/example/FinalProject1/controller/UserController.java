package com.example.FinalProject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FinalProject1.model.User;
import com.example.FinalProject1.repository.userrepo;

@Controller
public class UserController {
	
	@Autowired
	private userrepo urepo;
	
	@GetMapping("/")
	public String showRegistrationForm()
	{
		return "register.jsp";
	}
	
	@PostMapping("/Registration1")
	public String registerUser(@ModelAttribute User user)
	{
		urepo.save(user);
		return "login.jsp";	
	}
	
	@GetMapping("/login1")
	public String login(@RequestParam String email,@RequestParam String Password)
	{
		System.out.println(email);
		System.out.println(Password);
		
		User ob=urepo.findByEmail(email);
		if(ob!=null && ob.getEmail().equalsIgnoreCase(email) && ob.getPassword().equals(Password))
		{
			return "dashboard.jsp";
		}
		else
		{
			return "login.jsp";
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}