package com.hgsh.spring.bean;

import java.util.Date;

public class Bean1 {
	
	private String str;
	private Date date;
	
	public void ini(){
		System.out.println("ini work..");
	}
	
	public Bean1(){
		System.out.println("Bean1 instance created");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
