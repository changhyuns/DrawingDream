package com.dd.db.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dd.db.entity.user.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, UUID> {
	
	Optional<Auth> findByLoginId(String loginId); 

}