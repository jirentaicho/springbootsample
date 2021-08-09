package com.volkruss.application.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AnimationRequest {
	
	private String title;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date broadcast_start;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date broadcast_end;
}
