package com.gt.bbs.service;

import java.util.ArrayList;
import java.util.List;

import com.gt.bbs.dao.UserDAO;
import com.gt.bbs.model.User;

public class UserService {
	public void add(User user){
		UserDAO userDAO = new UserDAO();
		userDAO.add(user);
	}
	public List<User> list(){
		System.out.println("return list from database");
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setName("guoteng1");
		user1.setAge(1);
		User user2 = new User();
		user2.setName("guoteng2");
		user2.setAge(2);
		users.add(user1);
		users.add(user2);
		return users;
	}
	public void deleteById(){
		System.out.println("delete from database");
	}
	public void updateById(){
		System.out.println("update from database");
	}

}
