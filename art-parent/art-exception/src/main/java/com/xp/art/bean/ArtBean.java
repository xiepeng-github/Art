package com.xp.art.bean;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class ArtBean {
	
	//艺术家的名称
	@NotBlank(message="艺术家的名称不能为空")
	private String name;
	
	//艺术家的国家
	@Length(min=1, max=20,message="国家的长度只能处于1到20之间")
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
