package com.venkat.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
