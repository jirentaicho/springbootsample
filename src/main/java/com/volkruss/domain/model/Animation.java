package com.volkruss.domain.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Animation {

	private int id;
	
	private String title;
	
	private Date broadcast_start;
	
	private Date broadcast_end;
	
	/**
	 * <P>
	 * 現在放送中かどうかを返します。
	 * </p>
	 * 
	 * @return　放送期間が現在時刻の範囲ならばTrue / そうでない場合はfalse
	 */
	public boolean isBroadNow() {
		//　日付の範囲内の場合True
		Date today = new Date();
		return today.after(broadcast_start) && today.before(broadcast_end);
	}
}
