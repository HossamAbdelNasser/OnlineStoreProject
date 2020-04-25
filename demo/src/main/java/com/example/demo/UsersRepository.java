package com.example.demo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {

	Optional<Users> findByUsername(String username);
}
