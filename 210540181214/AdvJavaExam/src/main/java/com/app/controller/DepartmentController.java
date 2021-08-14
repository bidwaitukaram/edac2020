package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IDepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private IDepartmentService deptService;
	public DepartmentController() {
		System.out.println("in const of dept "+getClass().getName());
	}
	
	@GetMapping("/departments")
	public String showDepartments(HttpSession session)
	{
		session.setAttribute("dept_details", deptService.fetchAllDepartments());
		return "/department/departments";
	}
	
}
