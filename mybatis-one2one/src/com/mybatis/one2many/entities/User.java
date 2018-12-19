package com.mybatis.one2many.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;

	private String uUsername;

	private String uPassword;
	
	private List<Item> itemList = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uUsername=" + uUsername + ", uPassword=" + uPassword + ", itemList=" + itemList
				+ "]";
	}
	
}