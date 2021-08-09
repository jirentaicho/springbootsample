package com.volkruss.domain.mapper.impl;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.volkruss.domain.entity.AnimationEntity;
import com.volkruss.domain.mapper.AnimationMapper;
import com.volkruss.domain.model.Animation;

@Component
public class AnimationMapperImpl implements AnimationMapper{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Animation toAnimation(AnimationEntity entity) {
		Animation animation = new Animation();
		animation.setTitle(entity.getTitle());
		animation.setBroadcast_start(entity.getBroadcast_start());
		animation.setBroadcast_end(entity.getBroadcast_end());
		return animation;
	}
	
	//　追加
	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnimationEntity toAnimationEntity(Animation animation) {
		AnimationEntity entity = new AnimationEntity();
		if(Objects.nonNull(animation.getId())) {
			entity.setId(animation.getId());
		}		
		entity.setTitle(animation.getTitle());
		entity.setBroadcast_start(animation.getBroadcast_start());
		entity.setBroadcast_end(animation.getBroadcast_end());
		return entity;
	}
}
