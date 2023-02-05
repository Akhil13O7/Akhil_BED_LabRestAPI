package com.gl.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentmanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
