package com.volkruss.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "m_animation")
public class AnimationEntity{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_animation_id_seq")
	@SequenceGenerator(name = "m_animation_id_seq",sequenceName = "m_animation_id_seq",initialValue = 1,allocationSize = 1)
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "broadcast_start")
	private Date broadcast_start;
	
	@Column(name = "broadcast_end")
	private Date broadcast_end;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "updated_at")
	private Date updated_at;
}
