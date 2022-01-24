package com.dd.db.entity.school;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dd.db.entity.BaseEntity;
import com.dd.db.enums.Code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class School extends BaseEntity {
	
	@Enumerated(EnumType.STRING)
	private Code schoolCode;
	
	private String schoolName;
	
	@Column(name="del_yn", columnDefinition="BOOLEAN DEFAULT false")
	private boolean delYn;
	
}
