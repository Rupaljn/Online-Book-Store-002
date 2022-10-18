package com.rakuten.dto;

import java.util.Date;

public class BaseBean {
private int id;
private Date createdDate;
private String createdBy;
private Date modifyDate;
private String modifyBy;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getModifyDate() {
	return modifyDate;
}
public void setModifyDate(Date modifyDate) {
	this.modifyDate = modifyDate;
}
public String getModifyBy() {
	return modifyBy;
}
public void setModifyBy(String modifyBy) {
	this.modifyBy = modifyBy;
}

}
