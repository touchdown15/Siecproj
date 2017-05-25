package siec.main;

import siec.util.HibernateUtil;

public class GeraTabelas {

	public static void main(String[] args) {
		
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();

	}

}
