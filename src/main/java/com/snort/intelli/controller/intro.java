package com.snort.intelli.controller;

public class intro {

	private int id;
	private String name;
	private String mob;
	int a =1;
	int b=0;
	
	public intro(int id, String name, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
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
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "intro [id=" + id + ", name=" + name + ", mob=" + mob + ", a=" + a + "]";
	}
	
	
}
