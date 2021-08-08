package com.rest.api.entity;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Empdata {
	
	@Id
	private Long id;
	public void setId(Long id) {
		this.id = id;
	}

	@Size(min=3)
	private String Name;
	private Number Age;
	
	
	private Number Contact;
	private Timestamp reg_time;
	
	
		public Empdata(Long id, String name, Number age, Number contact, Timestamp reg_time) {
		super();
		id = id;
		Name = name;
		Age = age;
		Contact = contact;
		this.reg_time = reg_time;
	}
	
		
		@Override
		public String toString() {
			return "Empdata [Id=" + id + ", Name=" + Name + ", Age=" + Age + ", Contact=" + Contact + ", reg_time="
					+ reg_time + "]";
		}


		
		public Long getId() {
			return id;
		}


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public Number getAge() {
			return Age;
		}


		public void setAge(Number age) {
			Age = age;
		}


		public Number getContact() {
			return Contact;
		}


		public void setContact(Number contact) {
			Contact = contact;
		}


		public Timestamp getReg_time() {
			return reg_time;
		}


		public void setReg_time(Timestamp reg_time) {
			this.reg_time = reg_time;
		}


		public Empdata() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
