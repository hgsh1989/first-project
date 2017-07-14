package com.hgsh.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hgsh.spring.bean.Bean1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("work....");
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
		Bean1 bean1 = (Bean1) ac.getBean("bean1");
		System.out.println(bean1.getStr());
		System.out.println(bean1.getDate());
		((AbstractApplicationContext) ac).close();
	}

}
