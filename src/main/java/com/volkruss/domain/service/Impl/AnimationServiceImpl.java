package com.volkruss.domain.service.Impl;

import java.util.List;

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

	//　追加
	@Override
	public void insert(AnimationRequest request) {
		Animation animation = create(request);
		animationRepository.insert(animation);
	}
	
	// 追加
	/**
	 * <P>
	 * リクエストからモデルを作成します。
	 * </P>
	 * @param request
	 * @return
	 */
	private Animation create(AnimationRequest request) {
		Animation animation = new Animation();
		animation.setTitle(request.getTitle());
		animation.setBroadcast_start(request.getBroadcast_start());
		animation.setBroadcast_end(request.getBroadcast_end());
		return animation;
	}
}
