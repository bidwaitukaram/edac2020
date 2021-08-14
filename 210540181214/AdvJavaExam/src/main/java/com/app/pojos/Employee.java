package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "emp_tbl")
public class Employee extends BaseEntity {

	@Column(length = 50)
	private String name;
	@Column(length = 20, unique = true)
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private int salary;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empr_id")
	private Department dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, LocalDate dob, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", salary=" + salary + "]";
	}
	
}
