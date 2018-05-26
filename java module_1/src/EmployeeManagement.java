//package com;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManagement {
	private ArrayList<Employee> employeeList=new ArrayList<Employee>();
	
	public int addEmployee(Employee e){
		employeeList.add(e);
		return employeeList.size();
		
	}
	public Employee getEmployee(int x) throws EmployeeNotFoundException{
		Employee obj = null;
		for(Employee e:employeeList){
			if(x==e.getEmpoyeeId())
				obj= e;
			else
				throw new EmployeeNotFoundException("Employee with the given employeeId does not exist");
		}
		return obj;
	
	}
	public int deleteEmployee(int j){
		int f=0;
		for(Employee e:employeeList){
			if(j==e.getEmpoyeeId()){
				employeeList.remove(e);
				f=1;
				}
			}
		if(f==1)
			return employeeList.size();
		else
			return -1;
		
	}
	
	public Employee updateEmployee(int x,String st) throws EmployeeAlreadyUpdatedException{
		int f=0;
		Employee obj = null;
		for(Employee e:employeeList){
			if(x==e.getEmpoyeeId()){
				if(st==e.getEmployeeType()){
					f=1;
					throw new EmployeeAlreadyUpdatedException("No updation required :Employee already has required employeeType");
				}
			}
		}
		if(f==0){
			for(Employee em:employeeList){
				if(x==em.getEmpoyeeId())
					em.setEmployeeType(st);
					obj=em;
				}
			}
		
		
		return obj;
		
	}
	
	public HashMap<String,Employee> getHighestPaidEmployeeByEmployeeType(ArrayList<String> li){
		HashMap<String,Employee> hash=new HashMap<>();
		for(Employee e:employeeList){
			for(String st:li){
				
			}
		}
		return null;
		
	}
	
	
}

