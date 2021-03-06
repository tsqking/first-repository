/**
 * Project Name:campus_community
 * File Name:Activity.java
 * Package Name:com.clps.common.bean
 * Date:2017年3月22日下午9:51:53
 * Copyright (c) 2017, tsqking@163.com All Rights Reserved.
 *
*/

package com.clps.common.bean;

import java.io.Serializable;

/**
 * ClassName:Activity <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年3月22日 下午9:51:53 <br/>
 * 
 * @author Charles
 * @version
 * @since JDK 1.8
 * @see
 */
public class Activity implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * 
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 1L;
	private int a_id;
	private String a_name;
	private String a_detail;
	private String a_send_nickname;
	private String a_send_date;
	private String a_update_nickname;
	private String a_update_time;
	private int a_is_enable;

	public Activity() {
		super();
	}

	public Activity(int a_id, String a_name, String a_detail, String a_send_nickname, String a_send_date,
			String a_update_nickname, String a_update_time, int a_is_enable) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_detail = a_detail;
		this.a_send_nickname = a_send_nickname;
		this.a_send_date = a_send_date;
		this.a_update_nickname = a_update_nickname;
		this.a_update_time = a_update_time;
		this.a_is_enable = a_is_enable;
	}

	public int getA_id() {
		return a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public String getA_detail() {
		return a_detail;
	}

	public String getA_send_nickname() {
		return a_send_nickname;
	}

	public String getA_send_date() {
		return a_send_date;
	}

	public String getA_update_nickname() {
		return a_update_nickname;
	}

	public String getA_update_time() {
		return a_update_time;
	}

	public int getA_is_enable() {
		return a_is_enable;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public void setA_detail(String a_detail) {
		this.a_detail = a_detail;
	}

	public void setA_send_nickname(String a_send_nickname) {
		this.a_send_nickname = a_send_nickname;
	}

	public void setA_send_date(String a_send_date) {
		this.a_send_date = a_send_date;
	}

	public void setA_update_nickname(String a_update_nickname) {
		this.a_update_nickname = a_update_nickname;
	}

	public void setA_update_time(String a_update_time) {
		this.a_update_time = a_update_time;
	}

	public void setA_is_enable(int a_is_enable) {
		this.a_is_enable = a_is_enable;
	}

	@Override
	public String toString() {
		return "Activity [a_id=" + a_id + ", a_name=" + a_name + ", a_detail=" + a_detail + ", a_send_nickname="
				+ a_send_nickname + ", a_send_date=" + a_send_date + ", a_update_nickname=" + a_update_nickname
				+ ", a_update_time=" + a_update_time + ", a_is_enable=" + a_is_enable + "]";
	}

}
