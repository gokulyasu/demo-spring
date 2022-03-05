
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Entity
@EnableJpaRepositories
@Table(name="student")
public class DemoModel {
	@Id
	@Column(name="ID",unique = true)
	private int ID;
	@Column(name="name")
	private String name;
	
	@Column(name="marks")
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
