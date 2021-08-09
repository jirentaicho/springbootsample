package com.volkruss.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.domain.service.AnimationService;

@Controller
public class RegisterController {
	
	@Autowired
	private AnimationService animationService;

	@PostMapping("/register")
	public String register(AnimationRequest request,Model model) {
		animationService.insert(request);
		return "redirect:/";
	}
	
}
