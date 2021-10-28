package com.hibernate.mobiledao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mobilentity.MobileEntity;

public class MobileDAOImp implements MobileDAO {

	@Override
	public void saveMobileDetails() {

		System.out.println("Invoked Save Mobile Details");
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;

		try {
			Configuration con = new Configuration();

			con.configure("hibernate.cfg.xml");
			con.addAnnotatedClass(MobileEntity.class);

			sf = con.buildSessionFactory();

			session = sf.openSession();

			MobileEntity mobileEntity = new MobileEntity(3, "Realme", 30000, 256, "cement");

			tx = session.beginTransaction();

			session.save(mobileEntity);

			tx.commit();
		} catch (HibernateException e) {
			System.out.println("Inside catch block !!...");
			tx.rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed!!!!");
			} else {
				System.out.println("Session is not closed!!!!");
			}
			if (sf != null) {
				sf.close();
				System.out.println("SessionFactory is closed!!!!");
			} else {
				System.out.println("SessionFactory is not closed!!!!");
			}
		}
	}

	@Override
	public void getMobileDetails() {

		System.out.println("Invoked Get Mobile Details");
		SessionFactory sf = null;
		Session session = null;

		try {
			Configuration con = new Configuration();

			con.configure("hibernate.cfg.xml");
			con.addAnnotatedClass(MobileEntity.class);

			sf = con.buildSessionFactory();

			session = sf.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 1);

			System.out.println("Read is Ready" + mobileEntity);

		} catch (HibernateException e) {
			System.out.println("Inside catch block !!...");

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed!!!!");
			} else {
				System.out.println("Session is not closed!!!!");
			}
			if (sf != null) {
				sf.close();
				System.out.println("SessionFactory is closed!!!!");
			} else {
				System.out.println("SessionFactory is not closed!!!!");
			}
		}
	}

	@Override
	public void updateMobileDetails() {

		System.out.println("Invoked Update Mobile Details");
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;

		try {
			// Step 1 bbotstrap hibernate frame
			Configuration con = new Configuration();

			// step 2 to parse hibernate.cfg.xml
			con.configure("hibernate.cfg.xml");

			// step 3 read metadata from annotations which are associated with entity class
			con.addAnnotatedClass(MobileEntity.class);

			// step 4 configurations use mappings and properties to create sessionFactory
			sf = con.buildSessionFactory();

			session = sf.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 3);

			System.out.println("Update is Ready" + mobileEntity);

			mobileEntity.setColor("Cream");
			mobileEntity.setMobileBrand("OPPO");
			mobileEntity.setRom(2048);

			tx = session.beginTransaction();
			session.update(mobileEntity);
			tx.commit();
			System.out.println("Updated Details : " + mobileEntity);
		} catch (HibernateException e) {
			System.out.println("Inside catch block !!...");
			tx.rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed!!!!");
			} else {
				System.out.println("Session is not closed!!!!");
			}
			if (sf != null) {
				sf.close();
				System.out.println("SessionFactory is closed!!!!");
			} else {
				System.out.println("SessionFactory is not closed!!!!");
			}
		}
	}

	@Override
	public void deleteMobileDetails() {

		System.out.println("Invoked Delete Mobile Details");
		SessionFactory sf = null;
		Session session = null;

		try {
			Configuration con = new Configuration();

			con.configure("hibernate.cfg.xml");

			con.addAnnotatedClass(MobileEntity.class);

			sf = con.buildSessionFactory();

			session = sf.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 3);

			System.out.println("Deleting is Ready" + mobileEntity);

			Transaction tx = session.beginTransaction();
			session.delete(mobileEntity);
			tx.commit();
			System.out.println("Deleted the details");

		} catch (HibernateException e) {
			System.out.println("Inside catch block !!...");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed!!!!");
			} else {
				System.out.println("Session is not closed!!!!");
			}
			if (sf != null) {
				sf.close();
				System.out.println("SessionFactory is closed!!!!");
			} else {
				System.out.println("SessionFactory is not closed!!!!");
			}
		}
	}

}
