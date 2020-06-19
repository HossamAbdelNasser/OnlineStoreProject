package com.example.demo;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> user = usersRepository.findByUsername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Not found " + username));
		return user.map(MyUserDetails::new).get();
	}
	
	

}
