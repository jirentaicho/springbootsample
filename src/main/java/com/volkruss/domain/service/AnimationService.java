package com.volkruss.domain.service;

import java.util.List;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.domain.model.Animation;

public interface AnimationService {
	public List<Animation> getAnimationList();
	public void insert(AnimationRequest request);
}
