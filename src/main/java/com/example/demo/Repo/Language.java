package com.example.demo.Repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	String policy;
	String code;
	
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Language(Long id, String policy, String code) {
		super();
		this.id = id;
		this.policy = policy;
		this.code = code;
	}
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
