package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired 
	UsersRepository usersRepository;
	
	@GetMapping(value = "/all")
	public List<Users> getALL () {
		return usersRepository.findAll();
	}

	@PostMapping(value = "/load")
	public List <Users> persist(@RequestBody final Users users) {
		usersRepository.save(users);
		return usersRepository.findAll(); 
	}
}
