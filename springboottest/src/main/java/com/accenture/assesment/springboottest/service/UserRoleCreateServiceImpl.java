package com.accenture.assesment.springboottest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.assesment.springboottest.entity.Users;
import com.accenture.assesment.springboottest.repository.UsersRepository;


@Service
public class UserRoleCreateServiceImpl implements UserRoleCreateService {
	
	 @Autowired
	    private UsersRepository usersRepository;

	@Override
	public Users createUser(Users user) {
		
		return usersRepository.save(user);
	}

}
