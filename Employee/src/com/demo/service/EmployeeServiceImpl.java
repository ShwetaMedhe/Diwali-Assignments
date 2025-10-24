package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String ename=sc.next();
		System.out.println("Enter Employee Role:");
		String erole=sc.next();
		Employee e = new Employee(ename,eid,erole);
		return edao.save(e);
	}

	@Override
	public boolean deleteById(int id) {
		
		return edao.deleteById(id);
	}

	@Override
	public List<Employee> displayAll() {
	
		return edao.showData();
	}

	@Override
	public List<Employee> sortById() {
		
		return edao.sortById();
	}

	@Override
	public List<Employee> searchByName(String name) {
		
		return edao.searchByName(name);
	}

	@Override
	public void readFile(String string) {
		edao.readFile(string);
		
	}

	@Override
	public void writeToFile(String string) {
	
		edao.writeFile(string);
	}

}