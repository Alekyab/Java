/**
 * 
 */
package com.cloudwick.training.json;

import java.util.List;

/**
 * @author alekya
 *
 */
public class UserJson {

	private String name;
	private String age;
	private List<String> msg;
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
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the msg
	 */
	public List<String> getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(List<String> msg) {
		this.msg = msg;
	}
	
}
