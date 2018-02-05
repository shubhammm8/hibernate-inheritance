package com.kalinga.Main;

import org.hibernate.Session;

import com.kalinga.TablePerConcreteClass.Employee1;
import com.kalinga.TablePerConcreteClass.Owner;
import com.kalinga.TablePerConcreteClass.Person;

public class MainConcreteClass {

	public static void main(String[] args) {
		Session s=HibernateUtil.buildSessionFactory().openSession();
		s.beginTransaction();
		
		Person p=new Person();
		p.setId(1);
		p.setFname("L");
		p.setLname("Lapaat");
		
		Employee1 e=new Employee1();
		e.setCompany("Mindtree");
		e.setId(2);
		e.setFname("Suraj");
		e.setLname("Kalyam Puri");
		
		Owner o=new Owner();
		o.setFname("Vidit");
		o.setId(3);
		o.setLname("Suryavanshi");
		o.setInvestedIn("Dhampur Mill");
		
		s.save(p);
		s.save(e);
		s.save(o);
		
		s.getTransaction().commit();
		s.close();
		

	}

}
