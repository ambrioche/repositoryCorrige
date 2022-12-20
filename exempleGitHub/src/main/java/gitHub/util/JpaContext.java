package owliance.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import appTest.dao.DaoDepartement;
import appTest.dao.DaoDepartementJpaImpl;
import appTest.dao.DaoEmploye;
import appTest.dao.DaoEmployeJpaImpl;


public class JpaContext {
	
	private static EntityManagerFactory emf=null;
	public static void setDaoEmploye(DaoEmploye daoEmploye) {
		JpaContext.daoEmploye = daoEmploye;
	}

	public static void setDaoDepartement(DaoDepartement daoDepartement) {
		JpaContext.daoDepartement = daoDepartement;
	}
	private static DaoEmploye daoEmploye=null;
	private static DaoDepartement daoDepartement=null;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("exoOwliance");
		}
		return emf;
	}

	public static void DestroyJpaContext() {
		if (emf != null) {
			emf.close();
			emf = null;
		}
	}
	public static DaoEmploye getDaoEmploye() {
		if(daoEmploye==null) {
			daoEmploye=new DaoEmployeJpaImpl();
		}
		return daoEmploye;
	}
	
	public static DaoDepartement getDaoDepartement() {
		if(daoDepartement==null) {
			daoDepartement=new DaoDepartementJpaImpl();
		}
		return daoDepartement;
	}
	


	

	
}