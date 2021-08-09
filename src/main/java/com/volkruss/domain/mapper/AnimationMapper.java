package com.volkruss.domain.mapper;

import com.volkruss.domain.entity.AnimationEntity;
import com.volkruss.domain.model.Animation;

public interface AnimationMapper {
	/**
	 * <p>
	 * アニメーションエンティティをアニメーションモデルに変換します。
	 * </p>
	 * 
	 * @param {@link AnimationEntity} アニメーションエンティティ
	 * 
	 * @return {@link Animation} に変換した結果を返却します。
	 */
	public Animation toAnimation(AnimationEntity entity);
	
	/**
	 * <p>
	 * アニメーションモデルをアニメーションエンティティに変換します。
	 * </p>
	 * 
	 * @param {@link Animation}アニメーションモデル
	 * 
	 * @return {@link AnimationEntity}　に変換した結果を返却します。
	 */
	public AnimationEntity toAnimationEntity(Animation animation);
}
