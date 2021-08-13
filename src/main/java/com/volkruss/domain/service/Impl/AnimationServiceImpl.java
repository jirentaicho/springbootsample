package com.volkruss.domain.service.Impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.domain.entity.AnimationRepository;
import com.volkruss.domain.model.Animation;
import com.volkruss.domain.service.AnimationService;

@Service
public class AnimationServiceImpl implements AnimationService{

	@Autowired
	private AnimationRepository animationRepository; 
	
	@Override
	public List<Animation> getAnimationList() {
		return animationRepository.getAll();
	}

	@Override
	public void insert(AnimationRequest request) {
		// requestの内容をModelMapperを利用して変換する
		ModelMapper modelMapper = new ModelMapper();
		Animation animation = modelMapper.map(request,Animation.class);
		animationRepository.insert(animation);
	}	
}
