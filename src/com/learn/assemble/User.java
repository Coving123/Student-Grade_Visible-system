package com.learn.assemble;

import java.util.List;

public class User {
	
	private String name;
	private Integer key;
	private List<String> list;
	
	public User(String name, Integer key, List<String> list) {
		super();
		this.name = name;
		this.key = key;
		this.list = list;
	}
	
	public User() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", key=" + key + ", list=" + list + "]";
	}

}
