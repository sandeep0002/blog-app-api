package com.codewithsandeep.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codewithsandeep.blog.entities.User;
import com.codewithsandeep.blog.exception.ResourceNotFoundException;
import com.codewithsandeep.blog.repositories.UserRepo;

@Service
public class CustomerUserDetailService  implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// loading userfrom database by username
		
		User user = this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User", "email : "+username, 0));
		
		return user;
	}

}
