/*
Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double), the year the employee started to work, and the national 
insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
class Employee extends person{
	double salary;
	int year;
	String insurence;
	Employee(){
		salary = 1.22;
		year = 1998;
		insurence = "14131";
	}
	Employee(double sal,int yr,String ins){
		salary = sal;
		 year=yr;
		insurence = ins;
	}
	double getSalary(){
		return salary;
	}
	int getYear(){
		return year;
	}
	String getIns(){
		return insurence;
	}
}
class TestEmployee
{
	public static void main(String args[]){
			Employee emp = new Employee();
			System.out.println(emp.getSalary());
			Employee emp1 = new Employee(1.33,1997,"141311");
			System.out.println(emp1.getYear());
			System.out.println(emp1.member);
	}
}