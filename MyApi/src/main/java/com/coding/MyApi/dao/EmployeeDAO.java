package com.coding.MyApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.MyApi.Repository.EmployeeRepository;
import com.coding.MyApi.model.Employee;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	/*Save an employee*/
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	
	/*search all employee*/
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
	
	
	/*get an employee by Id*/
	public Employee findOne(Long empid)
	{
		return employeeRepository.findOne(empid);
	}
	
	
	/*delete an employee*/
	public void delete(Employee emp)
	{
		 employeeRepository.delete(emp);
	}
	
	
	
	
	
}
