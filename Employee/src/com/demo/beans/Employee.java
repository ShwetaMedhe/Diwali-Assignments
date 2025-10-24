package com.demo.beans;

import java.util.Objects;

public class Employee {
private String empName;
private int empID;
private String empRole;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String empName, int empID, String empRole) {
	super();
	this.empName = empName;
	this.empID = empID;
	this.empRole = empRole;
}

public Employee(int empID) {
	super();
	this.empID = empID;
}



@Override
public boolean equals(Object obj) {
	System.out.println("in equals method "+this.empID+"----"+((Employee)obj).empID);
	return this.empID==((Employee)obj).empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpRole() {
	return empRole;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empID=" + empID + ", empRole=" + empRole + "]";
}


}