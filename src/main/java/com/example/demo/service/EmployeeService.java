package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
   
	@Autowired
	private EmployeeRepository repo;
	
	//here Employee is Entity and is imported.
	public Iterable<Employee> listAll(){
		return this.repo.findAll();
	}
	
	//saving a specific record by using the method save of CrudRepository
	public void saveOrUpdate(Employee employees) {
		repo.save(employees);
	}
	
	//getting a specific record by using findById() method of CrudRepository
	public Employee getEmployeeById(long id) {
		return repo.findById(id).get();
	}
	public Employee get(long id) {
		return repo.findById(id).get();
	}
	public void delete(long id) {
		repo.deleteById(id);
	}
}
