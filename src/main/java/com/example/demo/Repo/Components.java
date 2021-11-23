package com.example.demo.Repo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Components {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	String type;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Parameters> parameters;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Parameters> getParameters() {
		return parameters;
	}
	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;
	}
	public Components(Long id, String type, List<Parameters> parameters) {
		super();
		this.id = id;
		this.type = type;
		this.parameters = parameters;
	}
	public Components() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
