package com.example.jwtToken.dao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jwtToken.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}

