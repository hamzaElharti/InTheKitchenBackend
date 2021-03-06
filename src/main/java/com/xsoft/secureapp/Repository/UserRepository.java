package com.xsoft.secureapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsoft.secureapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
	public List<User> findAll();
}
