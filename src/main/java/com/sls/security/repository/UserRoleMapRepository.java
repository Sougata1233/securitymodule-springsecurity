package com.sls.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sls.security.entity.Role;
import com.sls.security.entity.UserRoleMap;
import com.sls.security.entity.Users;

public interface UserRoleMapRepository extends CrudRepository<UserRoleMap, Long>{

    Optional<UserRoleMap> findById(Long i);

    List<UserRoleMap> findByUser(Users user);
    
    List<UserRoleMap> findByRole(Role role);

}
