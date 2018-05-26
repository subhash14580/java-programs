/*
 Create an Employee class with the related attributes and behaviours.
  Create one more class EmployeeDB which has the following methods. 
  a. boolean addEmployee(Employee e) 
  b.  boolean deleteEmployee(int eCode) 
  c.  String showPaySlip(int eCode) 
  d.  Employee[] listAll() 
  Use an ArrayList which will be used to store the emplyees
   and use enumeration/iterator to process the employees.
   Write a Test Program to test that all functionalities are operational.
 */
import java.util.*;
class problem2{
	public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("enter the no of employees");
      int test = in.nextInt();
      ArrayList<EmployeeDB> emp = new ArrayList<EmployeeDB>();
      while(test-- != 0){
       String s1 = in.next();
      String e1 = in.next();
      int eCode = in.nextInt();
      emp.add(new EmployeeDB(s1,e1,eCode));
      }
      ListIterator li = emp.listIterator();
      EmployeeDB e;
      while(li.hasNext()){
    	  e = (EmployeeDB)li.next();
    	  System.out.println(e.table());
      }
   }
}
class EmployeeDB{
	public String s1,s2;
	int  eCode;
	public EmployeeDB(String s1,String s2,int eCode){
		this.s1 = s1;
		this.s2 = s2;
		this.eCode = eCode;
	}
	public  ArrayList table(){
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(eCode);
		return al;
	}
	/*
	public static boolean addEmployee(problem2 obj){
		
	}
	public static boolean deleteEmployee(int eCode){
		
	}
	public static String showPaySlip(int eCode){
		
	}
	public static problem2[] listAll(){
		
	}
	*/
}