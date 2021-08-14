package com.volkruss.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.domain.entity.UserEntity;

public interface UserJpaDao extends JpaRepository<UserEntity,String>{

}
