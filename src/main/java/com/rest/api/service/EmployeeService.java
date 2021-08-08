package com.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rest.api.entity.Empdata;

public interface EmployeeService {

	
	public List<Empdata> getEmpData();
	public Optional<Empdata> getEmpDataById(Long Id);
	public Empdata addEmployee(Empdata empdata);
	public Empdata updateEmployee(Empdata empdata);
}
