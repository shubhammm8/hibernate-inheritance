package com.kalinga.Main;

import org.hibernate.Session;

import com.kalinga.TablePerClassHierarchy.ContractEmployee;
import com.kalinga.TablePerClassHierarchy.PermanentEmployee;

public class Main {

	public static void main(String[] args) {
		Session s=HibernateUtil.buildSessionFactory().openSession();
		s.beginTransaction();
		
		PermanentEmployee p=new PermanentEmployee(),p1=new PermanentEmployee();
		p.setCompanyName("Mindtree");
		p.setEmpName("Suraj");
		
		p1.setCompanyName("Mindfire");
		p1.setEmpName("Gautam");
		
		ContractEmployee c=new ContractEmployee(),c2=new ContractEmployee();
		
		c.setContractorName("Wipro");
		c.setEmpName("Verma");
		
		c2.setContractorName("Wipro");
		c2.setEmpName("Nishant");
		
		s.persist(p);
		s.persist(p1);
		s.persist(c);
		s.persist(c2);
		
		s.getTransaction().commit();
		s.close();
		
	
		
		
	}

}
