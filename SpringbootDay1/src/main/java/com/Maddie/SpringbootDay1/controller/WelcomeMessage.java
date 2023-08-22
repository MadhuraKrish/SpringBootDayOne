package com.Maddie.SpringbootDay1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {
@GetMapping("/display")
public String welcome()
{
	return "Welcome";
}
}
