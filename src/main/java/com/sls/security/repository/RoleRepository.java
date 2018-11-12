package com.sls.security.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sls.security.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findById(Long i);

    List<Role> findByRole(String roleName);

    // custom query example and return a stream
    @Query("select r from Role r where r.role = :roleName")
    Stream<Role> findByRoleReturnStream(@Param("roleName") String roleName);

}
