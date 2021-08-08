package com.rest.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Empdata;
import com.rest.api.service.EmployeeService;

@RestController
public class RestAPIController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "Hello GreenLight Planet";
	}

	@GetMapping("/empoyee")	
	public List<Empdata> getEmpData() {
		 return this.employeeService.getEmpData();

	}
	@GetMapping("/empoyee/{Id}")
	public Optional<Empdata> getEmpDataByID(@PathVariable Long Id) 
	{
		return this.employeeService.getEmpDataById(Id);
		
	}
	
	@PostMapping("/employee/addEmployee")
	public Empdata addEmpData(@Validated @RequestBody Empdata empdata) {
		return this.employeeService.addEmployee(empdata);
		
		
	}
	@PostMapping("/employee/updateEmployee")
	public Empdata updateEmpData(@RequestBody Empdata empdata) {
		return this.employeeService.updateEmployee(empdata);
		
		
	}

}
