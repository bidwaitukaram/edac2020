package com.app.controller;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Employee;
import com.app.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	public EmployeeController() {
	// TODO Auto-generated constructor stub
}
	@GetMapping("/hire_emp")
	public String showHireEmpForm(Employee employee)
	{
		return "/employee/hire_emp";
	}
	@PostMapping("/hire_emp")
	public String processHireEmpForm(@RequestParam String deptName,Employee employee,RedirectAttributes flashMap )
	{
		int age = Period.between(employee.getDob(), LocalDate.now()).getYears();
		if(age>25 && age<35 && employee.getSalary()>30000 && employee.getSalary()<40000)
		{
			flashMap.addFlashAttribute("message", employeeService.hireEmployee(employee, deptName));
		}
		else
			flashMap.addFlashAttribute("message", "Please enter valid age and salary");
		return "redirect:/department/departments";
	}
}
