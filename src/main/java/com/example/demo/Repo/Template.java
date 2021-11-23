package com.example.demo.Repo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Template {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	String namespace;
	String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	Language language;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Components> components;

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public List<Components> getComponents() {
		return components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;
	}

	public Template(Long id, String namespace, String name, Language language, List<Components> components) {
		super();
		this.id = id;
		this.namespace = namespace;
		this.name = name;
		this.language = language;
		this.components = components;
	}

	public Template() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	

}
