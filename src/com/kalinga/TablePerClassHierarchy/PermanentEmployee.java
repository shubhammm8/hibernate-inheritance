package com.kalinga.TablePerClassHierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PermanentEmployee")
@DiscriminatorValue("Permanent_EMP")
public class PermanentEmployee extends Employee{
	
	private String companyName;

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	

}
