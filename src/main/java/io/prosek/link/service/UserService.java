package io.prosek.link.service;

import io.prosek.link.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
	boolean authenticate(String userName, String password);
	
	List<User> findAll();
	Page<User> findAll(Pageable pageable);
	User findByUserName(String userName);
	User findById(Long id);
	User create(User user);
	User edit(User user);
	void deleteById(Long id);
}
