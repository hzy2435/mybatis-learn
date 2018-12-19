package com.mybatis.one2one.entities;

public class Wife {

	private Integer id;
	private String wifeName;
	private String wifeSex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getWifeSex() {
		return wifeSex;
	}

	public void setWifeSex(String wifeSex) {
		this.wifeSex = wifeSex;
	}

	@Override
	public String toString() {
		return "Wife [id=" + id + ", wifeName=" + wifeName + ", wifeSex=" + wifeSex + "]";
	}

}
