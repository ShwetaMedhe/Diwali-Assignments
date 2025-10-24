package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeService eservice = new EmployeeServiceImpl();
	eservice.readFile("empdata.txt");
	int choice =0;
	do {
		System.out.println("1. Add Employee to list");
		System.out.println("2. Remove Employee list");
		System.out.println("3. Show all Employee");
		System.out.println("4. Show all Employee in sorted order (sort on the basis of empID)");
		System.out.println("5. Find a Employee with empName");
		System.out.println("6. Save all Employees into file");
		System.out.println("7. Quit");
		System.out.println("Enter your Choice:");
		choice = sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status = eservice.addNewEmployee();
			if(status) {
				System.out.println("Added Successfully.");
			}
			else {
				System.out.println("Not Added.");
			}
		}
		
		case 2->{
			System.out.println("Enter Id to Delete");
			int id = sc.nextInt();
			boolean status = eservice.deleteById(id);
			if (status) {
				System.out.println("Deleted Successfully");
			} else {
				System.out.println("Not Found.");
			}
		}
		case 3->{
			List<Employee> emplist = eservice.displayAll();
			emplist.forEach(System.out::println);

		}
		case 4->{
			List<Employee> lst = eservice.sortById();
			lst.forEach(System.out::println);
		}
		case 5->{
			System.out.println("Enter your name to search");
			String name = sc.next();
			List<Employee> e = eservice.searchByName(name);
			if (e != null) {
				System.out.println(e);
			} else {
				System.out.println("Nout Found.");
			}
		}
		case 6->{
			eservice.writeToFile("empdata1.txt");
			
		}
		case 7->{
			System.out.println("Thank you for visiting......");
		}
		default ->{
			System.out.println("Wrong Choice.");
		}
		
		
		
		}
		
	}while(choice!=7);

	}

}