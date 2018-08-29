package com.devnet.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devnet.entities.Role;
import com.devnet.entities.User;
import com.devnet.repository.RoleRepository;
import com.devnet.util.RoleEnum;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User, Long> {
		
	@Autowired
	private RoleRepository roleRepository;
	
	public List<User> getAll(){
		List<User> users = super.getAll();
		users.forEach(user -> user.setPassword(null));
		return users;
	}
	
	public void add(@RequestBody User user) {
		Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		super.add(user);
	}
}
