/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Student.java 
 * @Prject: huangbing-exam04
 * @Package: com.huangbing.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月7日 上午8:15:58 
 * @version: V1.0   
 */
package com.huangbing.domain;

/** 
 * @ClassName: Student 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月7日 上午8:15:58  
 */
public class Student {

	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
