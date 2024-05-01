package com.twg.sprinboot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "my_table")
public class Customer {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String name;
		private  String plans;
		private  String nomini;
		private  int year;
		public long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPlans() {
			return plans;
		}
		public void setPlans(String plans) {
			this.plans = plans;
		}
		public String getNomini() {
			return nomini;
		}
		public void setNomini(String nomini) {
			this.nomini = nomini;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		
		
		

	}



