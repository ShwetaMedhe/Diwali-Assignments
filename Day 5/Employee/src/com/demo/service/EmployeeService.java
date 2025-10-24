package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteById(int id);

	List<Employee> displayAll();

	List<Employee> sortById();

	List<Employee> searchByName(String name);

	void readFile(String string);

	void writeToFile(String string);

}