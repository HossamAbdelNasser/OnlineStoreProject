package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
@GetMapping ("/user")

public String user() {
	return ("<h1>Welcome User</h1>");
}
}