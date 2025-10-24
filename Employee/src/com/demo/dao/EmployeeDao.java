package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	boolean deleteById(int id);

	List<Employee> showData();

	List<Employee> sortById();

	List<Employee> searchByName(String name);

	void readFile(String string);

	void writeFile(String string);

}