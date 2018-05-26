/*
 Create an employee object and initialize its properties.
  Create a clone of this object and store it in a different object. 
  Now change the properties of the first employee object. Print both the objects and observe the change.
*/
 import java.util.*;
 class Employee implements Cloneable{
 	String name;
 	int age;
 }
class problem4{
	public static void main(String args[]){
		Employee emp = new Employee();
		emp.name = "subhash";
		emp.age = 123;
		Employee emp1;
		emp1 = emp;
		System.out.println(emp.name+"  "+emp.age);
		System.out.println(emp1.name+"  "+emp1.age);
		emp1.age = 1234;
		System.out.println(emp1.name+"  "+emp1.age);
	}
}