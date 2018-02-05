package com.kalinga.TablePerSubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="MindtreeMinds")
@PrimaryKeyJoinColumn(name="id")
public class MindtreeMinds extends Minds{
	
	@Column(name="project")
	private String project;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	
	
	
	

}
