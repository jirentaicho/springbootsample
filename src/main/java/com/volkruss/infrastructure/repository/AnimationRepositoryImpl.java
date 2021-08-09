package com.volkruss.infrastructure.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volkruss.domain.entity.AnimationEntity;
import com.volkruss.domain.entity.AnimationRepository;
import com.volkruss.domain.mapper.AnimationMapper;
import com.volkruss.domain.model.Animation;

@Repository
public class AnimationRepositoryImpl implements AnimationRepository {

	@Autowired
	private AnimationJpaRepository animationJpaRepository;
	
	@Autowired
	private AnimationMapper animationMapper;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Animation> getAll() {
		List<AnimationEntity> lists = animationJpaRepository.findAll();
		return lists.stream().map(animationMapper::toAnimation).collect(Collectors.toList());
	}
	
	//　追加
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void insert(Animation animation) {
		AnimationEntity entity = animationMapper.toAnimationEntity(animation);
		animationJpaRepository.save(entity);
	}
	
	
}
