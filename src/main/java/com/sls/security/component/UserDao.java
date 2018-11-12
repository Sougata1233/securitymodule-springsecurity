package com.sls.security.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sls.security.entity.Users;
import com.sls.security.repository.UserRepository;

@Component
public class UserDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<Users> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<Users> userList = new ArrayList<Users>();
	for (Users user : userRepository.findAll()) {
	    userList.add(user);

	}
	return userList;

    }
    
    @Transactional(readOnly = true)
    public Users findByUserName(String userName) {
	return userRepository.findByUserName(userName);
    }
    
    @Transactional(readOnly = true)
    public Users findByUserName1(String userName) {
	return userRepository.findByUserName(userName);
    }

    @Transactional(readOnly = true)
    public Users findUserById(Long id) {
	return (Users) userRepository.findById(id).get();
    }

    
}
