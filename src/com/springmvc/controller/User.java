package com.springmvc.controller;

public class User {

	private int id;
	public User(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private String name;
	private String sex;
}
