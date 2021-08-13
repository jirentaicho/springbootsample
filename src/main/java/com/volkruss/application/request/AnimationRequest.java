package com.volkruss.application.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AnimationRequest {
	
	@NotEmpty
	private String title;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date broadcast_start;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date broadcast_end;
}
