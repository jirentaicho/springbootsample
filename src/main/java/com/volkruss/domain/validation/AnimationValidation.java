package com.volkruss.domain.validation;

import java.util.Locale;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.volkruss.application.request.AnimationRequest;

@Component
public class AnimationValidation implements Validator{
	
	@Autowired
	private MessageSource messageSource;

	@Override
	public boolean supports(Class<?> clazz) {
		// trueにしておく
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 動作確認のため汚いですがキャストします。
		execute((AnimationRequest)target,errors);
	}
	
	/**
	 * <P>
	 * 相関バリデーションを実行します。
	 * <br />
	 * 入力値の放送開始日付に入力がある場合は、放送終了日の入力が必須です。
	 * </P>
	 * 
	 * @param request アニメーションリクエスト
	 * @param errors エラー
	 */
	private void execute(AnimationRequest request,Errors errors) {
		// 放送開始日に入力があって、放送終了日に入力がない場合
		if(Objects.nonNull(request.getBroadcast_start()) && Objects.isNull(request.getBroadcast_end()) ) {
			errors.reject("broadcast_end_date",messageSource.getMessage("anicom.error.message001", null, Locale.JAPAN));
		}
	}

}
