package com.kalinga.TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTable2")
@AttributeOverrides({
		@AttributeOverride(name="FNAME",column=@Column(name="fname")),
		@AttributeOverride(name="LNAME",column=@Column(name="lname"))
		
})
public class Employee1 extends Person{
	@Column(name="company")
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
