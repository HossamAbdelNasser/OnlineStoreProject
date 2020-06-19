package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {
	@GetMapping ("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
}
