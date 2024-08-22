package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Myservice {
	public int add(int a,int b) {
		
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);
		return a+b;
	}

}
