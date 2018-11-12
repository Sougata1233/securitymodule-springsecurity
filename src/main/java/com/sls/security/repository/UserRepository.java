package com.sls.security.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sls.security.entity.Users;

public interface UserRepository extends CrudRepository<Users, Long>{

    Optional<Users> findById(Long i);

    Users findByUserName(String userName);

    
}
