package com.volkruss.domain.entity;

import java.util.List;

import com.volkruss.domain.model.Animation;

public interface AnimationRepository {
	/**
	 * <p>
	 * Animationモデルのリストを返却します。
	 * </p>
	 * 
	 * @return Animationモデルのリスト
	 */
	public List<Animation> getAll();
	
	
	/**
	 * <P>
	 * Animationを登録します。
	 * </P>
	 * @param animation アニメーションモデル
	 */
	public void insert(Animation animation);
}
