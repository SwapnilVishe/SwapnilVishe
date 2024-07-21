package com.swapin.tech.RestApi.Service;

import java.util.List;

import com.swapin.tech.RestApi.Repository.data.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployees();
	 Employee getEmployeeById(Long id);
	 Employee saveEmployee(Employee employee);
	 void deleteEmployee(Long id);
}
