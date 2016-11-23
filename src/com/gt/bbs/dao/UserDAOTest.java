package com.gt.bbs.dao;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.gt.bbs.model.User;

public class UserDAOTest {

	private UserDAO userDAO = new UserDAO();
	private User user = new User();
	@Before
	public void setUp() throws Exception {
//		user.setId(1);
		user.setName("Junit");
		user.setAge(11);
	}

	@Test
	public void testAdd() {
		userDAO.add(user);
	}

}
