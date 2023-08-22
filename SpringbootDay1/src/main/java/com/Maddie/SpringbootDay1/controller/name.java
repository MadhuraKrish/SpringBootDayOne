package com.Maddie.SpringbootDay1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	 @Value("${studName}")
     private String name;
     @GetMapping("name")
     public String getName() {
     	
			return "Welcome "+name+"!";
     }
}