package com.volkruss.infrastructure.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.domain.entity.UserEntity;

@Component
public class UserDao {

	@Autowired
	private UserJpaDao userJpaDao;
	
	public Optional<UserEntity> findByName(String name) {
		// TODO 取得の仕方を修正する
		return userJpaDao.findAll().stream().filter(u -> u.getName().equals(name)).findFirst();
	}
}
