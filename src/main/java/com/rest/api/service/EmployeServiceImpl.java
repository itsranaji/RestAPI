package com.rest.api.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dao.EmployeeDao;
import com.rest.api.entity.Empdata;

@Service
public class EmployeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Empdata> getEmpData() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Optional<Empdata> getEmpDataById(Long Id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(Id);
	}

	@Override
	public Empdata addEmployee(Empdata empdata) {
		// TODO Auto-generated method stub
		return employeeDao.save(empdata);
	}

	@Override
	public Empdata updateEmployee(Empdata empdata) {
		// TODO Auto-generated method stub
		return employeeDao.save(empdata);
	}

}
