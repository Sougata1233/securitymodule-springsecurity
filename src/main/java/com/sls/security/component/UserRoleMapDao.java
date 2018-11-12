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

import com.sls.security.entity.Role;
import com.sls.security.entity.UserRoleMap;
import com.sls.security.entity.Users;
import com.sls.security.repository.UserRoleMapRepository;

@Component
public class UserRoleMapDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRoleMapDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserRoleMapRepository userRoleMapRepository;

    @Transactional(readOnly = true)
    public List<UserRoleMap> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<UserRoleMap> userRoleMapList = new ArrayList<UserRoleMap>();
	for (UserRoleMap userRoleMap : userRoleMapRepository.findAll()) {
	    LOGGER.info("UserRoleMap : " + userRoleMap);
	    userRoleMapList.add(userRoleMap);

	}
	return userRoleMapList;

    }

    @Transactional(readOnly = true)
    public List<UserRoleMap> findByUser(Users user) {
	for (UserRoleMap userRoleMap : userRoleMapRepository.findByUser(user)) {
	    LOGGER.info("UserRoleMap : " + userRoleMap);
	}
	return userRoleMapRepository.findByUser(user);
    }
    
    @Transactional(readOnly = true)
    public List<UserRoleMap> findByRole(Role role) {
	for (UserRoleMap userRoleMap : userRoleMapRepository.findByRole(role)) {
	    LOGGER.info("UserRoleMap : " + userRoleMap);
	}
	return userRoleMapRepository.findByRole(role);
    }


    @Transactional(readOnly = true)
    public Optional<UserRoleMap> findUserRoleMapById(Long id) {
	/*for (UserRoleMap userRoleMap : userRoleMapRepository.findById(id)) {
	    LOGGER.info("UserRoleMap : " + userRoleMap);
	}*/
	return userRoleMapRepository.findById(id);
    }

    

}
