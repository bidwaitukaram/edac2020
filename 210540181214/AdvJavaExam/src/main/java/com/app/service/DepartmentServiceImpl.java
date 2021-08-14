package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IDepartmentDao;
import com.app.pojos.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {
	
	@Autowired
	private IDepartmentDao deptDao;
	@Override
	public List<Department> fetchAllDepartments() {
		
		return deptDao.fetchAllDepartments();
	}

}
