package com.mybatis.one2one.entities;

public class Husband {

	private Integer id;
	private String husbandName;
	private String husbandSex;
	private Wife wife;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public String getHusbandSex() {
		return husbandSex;
	}

	public void setHusbandSex(String husbandSex) {
		this.husbandSex = husbandSex;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", husbandName=" + husbandName + ", husbandSex=" + husbandSex + ", wife=" + wife
				+ "]";
	}

}
