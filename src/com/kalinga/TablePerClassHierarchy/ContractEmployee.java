package com.kalinga.TablePerClassHierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ContractEmployee")
@DiscriminatorValue("Contract_EMP")
public class ContractEmployee extends Employee{
	
	private String contractorName;

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	
	
	
	

}
