package com.sls.security.config.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sls.security.component.RoleDao;
import com.sls.security.component.UserDao;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	RoleDao roleDao;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
