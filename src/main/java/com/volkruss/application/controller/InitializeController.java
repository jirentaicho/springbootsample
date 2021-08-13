package com.volkruss.application.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.domain.model.Animation;
import com.volkruss.domain.service.AnimationService;

@Controller
public class InitializeController {
	
	@Autowired
	private AnimationService animationService;
	
	@Autowired 
	private MessageSource messageSource;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		List<Animation> animations = animationService.getAnimationList();
		//　modelに値を設定してViewで利用できるようなる
		model.addAttribute("animations",animations);
		return "index";
	}
	
	// @GetMapping("/message1")
	@RequestMapping("message1")
	public String getMessage1(Model model) {
		String message = messageSource.getMessage("anicom.message001", null, Locale.JAPAN);
		return message;
	}

	@GetMapping("/message2")
	public String getMessage2(Model model) {
		String message = messageSource.getMessage("anicom.message002", new String[]{"御坂美琴"}, Locale.JAPAN);
		return message;
	}

	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute("animationReqeust", new AnimationRequest());
		return "register";
	}
}
