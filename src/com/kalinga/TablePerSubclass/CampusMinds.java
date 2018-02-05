package com.kalinga.TablePerSubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CampusMinds")
@PrimaryKeyJoinColumn(name="id")
public class CampusMinds extends Minds{
	@Column(name="basecamp")
	private String basecamp;

	public CampusMinds(){
		
	}
	
	public String getBasecamp() {
		return basecamp;
	}

	public void setBasecamp(String basecamp) {
		this.basecamp = basecamp;
	}
	
	
	
	

}
