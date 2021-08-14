package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

@Repository
public class DepartmentDaoImpl implements IDepartmentDao {
 
	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Department> fetchAllDepartments() {
		String jpql = "select d from Department d";
		List<Department> deptList = new ArrayList<>();
		deptList = manager.createQuery(jpql,Department.class).getResultList();
		return deptList;
	}

}
