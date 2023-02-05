package com.gl.studentmanagement.service;

import org.springframework.stereotype.Service;

import com.gl.studentmanagement.entity.Role;
import com.gl.studentmanagement.repository.RoleRepository;

@Service
public class RoleService {

	private final RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Role saveRole(Role role) {
		System.out.println("Role " + role.toString());
		return this.roleRepository.save(role);
	}

}
