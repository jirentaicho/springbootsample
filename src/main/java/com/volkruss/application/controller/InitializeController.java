package com.volkruss.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.domain.model.Animation;
import com.volkruss.domain.service.AnimationService;

@Controller
public class InitializeController {
	
	@Autowired
	private AnimationService animationService;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		List<Animation> animations = animationService.getAnimationList();
		//　modelに値を設定してViewで利用できるようなる
		model.addAttribute("animations",animations);
		return "index";
	}
	
	//追加
	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute("animationReqeust", new AnimationRequest());
		return "register";
	}
}
