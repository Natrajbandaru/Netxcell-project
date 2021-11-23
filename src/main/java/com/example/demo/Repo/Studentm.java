package com.example.demo.Repo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Studentm {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
	String to;
	String recipient_type;
	String type;
	
	@OneToOne(cascade=CascadeType.ALL)
	Template  template;

	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getRecipient_type() {
		return recipient_type;
	}

	public void setRecipient_type(String recipient_type) {
		this.recipient_type = recipient_type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public Studentm(Long id, String to, String recipient_type, String type, Template template) {
		super();
//		this.id = id;
		this.to = to;
		this.recipient_type = recipient_type;
		this.type = type;
		this.template = template;
	}

	public Studentm() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
