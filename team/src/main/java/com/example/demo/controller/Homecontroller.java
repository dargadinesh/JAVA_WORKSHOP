package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Myservice;

@RestController
public class Homecontroller {
	 
	@Autowired
	Myservice myService;
	
	@GetMapping("/getuser")
	public String requestOne() {
		
		return "This is First request";
	}
       
	@GetMapping("/getauthour")
	public String requestTwo() {
			
		return "This is author details";
	}
	    
	@GetMapping("/add/{value1}/{value2}")
	public String requestThree(@PathVariable("value1") int value1, @PathVariable("value2") int value2) {
	    	
		int result=myService.add(value1, value2);
	    return "The Addition=" + result;
    }
	@GetMapping("/validate/{uname}/{pwd}")
	public String login(@PathVariable("uname") String uname, @PathVariable("pwd") String pwd) {
	    	
	    String O_uname = "zero";
	    String O_pwd = "zero11";
	    
	    if(O_uname.equals(uname)) {
	    	if(O_pwd.equals(pwd)) {
	    		return "welcome";
	    	}
	    	else {
	    		return " Invalid Password";
	    	}
	    }
	    	else {
	    		return "Invalid username";
	    	}
	    
	   
    }
}
