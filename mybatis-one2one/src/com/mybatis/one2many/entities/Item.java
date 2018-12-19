package com.mybatis.one2many.entities;

import java.util.List;

public class Item {
    private Long id;

    private String itemName;

    private Float itemPrice;

    private Long userId;
    
//    private List<User> userList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

//	public List<User> getUserList() {
//		return userList;
//	}
//
//	public void setUserList(List<User> userList) {
//		this.userList = userList;
//	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", userId=" + userId
				+ "]";
	}
	
}