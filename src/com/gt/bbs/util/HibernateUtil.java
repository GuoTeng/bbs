package com.gt.bbs.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sf = buildSessionFactory();
	private static SessionFactory buildSessionFactory(){
		try{
			return new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable ex){
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}
	
}
