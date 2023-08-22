package com.Maddie.SpringbootDay1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorchange {
	 @Value("${colour}")
     private String color;
     @GetMapping("color")
     public String color(){
     	
			return "My favorite color is "+color;
     }
}