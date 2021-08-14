package com.volkruss.domain.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AuthSetting extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests(request -> {
			request.antMatchers("/")
			.permitAll()
			.anyRequest()
			.authenticated();
		});
		http.formLogin();
		http.httpBasic();
	}
}
