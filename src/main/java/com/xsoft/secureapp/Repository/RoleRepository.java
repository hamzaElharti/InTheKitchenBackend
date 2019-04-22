package com.xsoft.secureapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsoft.secureapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
