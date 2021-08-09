package com.volkruss.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.domain.entity.AnimationEntity;

public interface AnimationJpaRepository extends JpaRepository<AnimationEntity,String>{
	
}
