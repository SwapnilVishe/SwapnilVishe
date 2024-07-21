package com.swapin.tech.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapin.tech.RestApi.Repository.data.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
