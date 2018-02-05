package com.kalinga.Main;

import javax.persistence.Query;

import org.hibernate.Session;

import com.kalinga.TablePerSubclass.CampusMinds;
import com.kalinga.TablePerSubclass.Minds;
import com.kalinga.TablePerSubclass.MindtreeMinds;

public class MainTPS {

	public static void main(String[] args) {
	
		Session s=HibernateUtil.buildSessionFactory().openSession();
		s.beginTransaction();
		
		Minds m=new Minds();
		m.setFname("Suraj");
		m.setLname("Kaaalayaaaaammmmmm");
		m.setId(1);
		
		CampusMinds c=new CampusMinds();
		c.setBasecamp("EAI");
		c.setId(2);
		c.setFname("Vidit");
		c.setLname("Suryavanshi");
		
	
		
		MindtreeMinds mm=new MindtreeMinds();
		mm.setProject("BFSI");
		mm.setId(3);
		mm.setFname("Rajat");
		mm.setLname("Sachan");
	
		
		s.save(m);
		s.save(c);
		s.save(mm);
		
		s.getTransaction().commit();
		
		
		s.close();
		
		
		
		
	}

}
