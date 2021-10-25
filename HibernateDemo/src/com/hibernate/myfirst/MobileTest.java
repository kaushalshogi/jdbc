package com.hibernate.myfirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.mobilentity.MobileEntity;

public class MobileTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(MobileEntity.class);
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		MobileEntity mobileEntity = new MobileEntity(2, "Redmi", 30000, 2048, "Green");
		session.save(mobileEntity);

		session.getTransaction().commit();

		session.close();
		sessionFactory.close();

	}

}
