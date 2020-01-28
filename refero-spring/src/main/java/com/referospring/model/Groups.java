package com.referospring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Groups implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int groupId;
	
	@Column(length=50, nullable=false)
	private String groupName;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "group")
	private List<Lists> listList=new ArrayList<>();
	
	
	public Groups(String groupName) {
		this.groupName = groupName;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Groups [groupId=" + groupId + ", groupName=" + groupName + "]";
	}
	
	
}