package com.volkruss.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.volkruss.application.request.AnimationRequest;
import com.volkruss.application.validation.AnimationValidation;
import com.volkruss.domain.service.AnimationService;

@Controller
public class RegisterController {
	
	@Autowired
	private AnimationService animationService;
	
	@Autowired
	private AnimationValidation animationValidation;
	
	@InitBinder
	public void validatorBinder(WebDataBinder binder) {
		binder.addValidators(animationValidation);
	}

	@PostMapping("/register")
	public String register(@Validated AnimationRequest request, BindingResult bindingResult , Model model) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			System.out.println("error");
			return "redirect:/";
		}
		animationService.insert(request);
		return "redirect:/";
	}
	
}