package com.kalinga.TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Owner")
@AttributeOverrides({
	@AttributeOverride(name="FNAME",column=@Column(name="fname")),
	@AttributeOverride(name="LNAME",column=@Column(name="lname"))
})
public class Owner extends Person{
	@Column(name="invetedIn")
	private String investedIn;

	public String getInvestedIn() {
		return investedIn;
	}

	public void setInvestedIn(String investedIn) {
		this.investedIn = investedIn;
	}
	
	
	
	
}
