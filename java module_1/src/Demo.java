//package com;

public class Demo {

	public static void main(String[] args) throws EmployeeNotFoundException {
		EmployeeManagement obj= new EmployeeManagement();
		PermanentEmployee e=new PermanentEmployee(123,"pavan","manager",20);
		PermanentEmployee e1=new PermanentEmployee(133,"Rajesh","sales",30);
		ContractEmployee e2=new ContractEmployee(345,"harman","deputy sales",21);
		obj.addEmployee(e);
		obj.addEmployee(e1);
		obj.addEmployee(e2);
		Employee ab=obj.getEmployee(143);
		
		
	}

}
