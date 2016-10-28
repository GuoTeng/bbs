package com.gt.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.gt.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware{

	/**
	 * Author:GuoTeng
	 */
	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private User user;
	public String add() {
		session.put("username", user.getName());
		System.out.println("____________"+user.getName()+":"+user.getAge());
		return SUCCESS;
	}
	public String delete() {
		System.out.println("____________"+user.getName()+":"+user.getAge());
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
