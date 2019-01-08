package com.accenture.assesment.springboottest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.accenture.assesment.springboottest.entity.Role;
import com.accenture.assesment.springboottest.entity.Users;
import com.accenture.assesment.springboottest.service.UserRoleCreateServiceImpl;




@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringboottestApplication.class,
				args);

		UserRoleCreateServiceImpl userRoleCreateService = applicationContext.getBean("userRoleCreateServiceImpl", UserRoleCreateServiceImpl.class);
		
		Role role = new Role();
		role.setRole("ADMIN");
		
		Set<Role> roleSet = new HashSet<Role>();
		roleSet.add(role);
		
		Users user = new Users();
		user.setActive(1);
		user.setEmail("test@gmail.com");
		user.setLastName("G");
		user.setName("siva");
		user.setPassword("siva");
		user.setRoles(roleSet);
		
		userRoleCreateService.createUser(user);
		
	}

}

