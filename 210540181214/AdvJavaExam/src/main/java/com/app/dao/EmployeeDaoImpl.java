package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

	@Autowired
	EntityManager manager;
	@Override
	public String hireEmployee(Employee employee,String deptName) {
		Department dept = manager.createQuery("select d from Department d where d.deptName=:deptName",Department.class).setParameter("deptName", deptName).getSingleResult();
		dept.hireEmp(employee);
		dept.setStrength(dept.getStrength()+1);
		manager.persist(dept);
		return "Employee hired successfully!";
	}

}
