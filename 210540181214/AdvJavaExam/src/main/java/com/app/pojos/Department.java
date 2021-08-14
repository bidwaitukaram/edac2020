package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_tbl")
public class Department  extends BaseEntity{
	@Column(length = 50,unique = true)
	private String deptName;
	@Column(length = 20)
	private String location;
	@Column
	private int strength;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String location, int strength) {
		super();
		this.deptName = deptName;
		this.location = location;
		this.strength = strength;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", location=" + location + ", strength=" + strength + "]";
	}
	public void hireEmp(Employee employee)
	{
		employees.add(employee);
		
		employee.setDept(this);
	}
	
}

