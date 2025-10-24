package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> emplist;
	static {
		emplist = new ArrayList<>();
		emplist.add(new Employee("Rakesh", 35, "HR"));
		emplist.add(new Employee("Shreya", 17, "Tester"));
		emplist.add(new Employee("Rahul", 69, "Developer"));
		emplist.add(new Employee("Priya", 21, "Manager"));
	}

	@Override
	public boolean save(Employee e) {
		return emplist.add(e);
		
	}

	@Override
	public boolean deleteById(int id) {
		return emplist.remove(new Employee(id));
	}

	@Override
	public List<Employee> showData() {
		// TODO Auto-generated method stub
		return emplist;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:emplist) {
			lst.add(e);
		}
	
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getEmpID()-o2.getEmpID();
		};
		lst.sort(c);
		return lst;
	}

	@Override
	public List<Employee> searchByName(String name) {
		List<Employee> temp= emplist.stream()
                .filter(emp->emp.getEmpName().equals(name))
                .collect(Collectors.toList());

       if(temp.size()>0) {
        return temp;
          }
        return null;
	}

	@Override
	public void readFile(String string) {
		File f = new File(string);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(string));){
			   while(true) {
				   Employee e=(Employee)ois.readObject();
				   emplist.add(e);
			   }
				
				
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
				
				
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void writeFile(String string) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(string))){
			for(Employee e:emplist) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
		
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}