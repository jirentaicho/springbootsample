package com.volkruss.domain.validation;

/**
 * バリデーション処理の基底クラスです。
 * 全てのバリデーション処理はこのクラスを継承します。
 * 
 * @author misaka
 *
 */
public abstract class Vol_Validation {
	/**
	 * バリデーション実行
	 * バリデーション処理については、フォームからのチェックだけでなくドメインチェックも行われる
	 * そのためコンテキストから取得して実行するようにする。
	 * ValicationContext
	 */
	// public abstract void execute(ValidationContext context);
}
