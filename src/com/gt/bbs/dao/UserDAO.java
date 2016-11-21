package com.gt.bbs.dao;

import org.hibernate.Session;

import com.gt.bbs.model.User;
import com.gt.bbs.util.HibernateUtil;

public class UserDAO {
	public void add(User user){
		System.out.println("插入数据库");
		user.setId(1);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
}
