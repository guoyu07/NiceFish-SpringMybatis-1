package com.nicefish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicefish.dao.PORoleMapper;
import com.nicefish.service.RoleService;

import java.util.Set;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	private PORoleMapper roleMapper;

	public PORoleMapper getRoleMapper() {
		return roleMapper;
	}
	@Autowired
	public void setRoleMapper(PORoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	public Set<String> findRoles(String username) {
		return roleMapper.findRoles(username);
	}
}
