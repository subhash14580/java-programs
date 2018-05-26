import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class project1
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		
		
		int id = Integer.parseInt(args[0]);
		HashMap<Integer,myclass> table = new HashMap<>();
		table.put(1001,new myclass("Ashish",'e',"R&D",20000,80000,3000));
		table.put(1002,new myclass("Sushma",'c',"PM",30000,12000,9000));
		table.put(1003,new myclass("Rahul",'k',"Acct",10000,8000,1000));
		table.put(1004,new myclass("chahat",'r',"Front Desk",12000,6000,2000));
		table.put(1005,new myclass("ranjan",'m',"Engg",50000,20000,20000));
		table.put(1006,new myclass("suman",'e',"Manufacturing",230000,9000,4400));
		table.put(1007,new myclass("Tanmey",'c',"PM",29000,12000,10000));
		
		myclass test1 = table.get(id);
		if(test1 == null){
			System.out.println("There is no employee with id :: "+id);
		}
		else{
			long d = 0;
			String cod="";
			char ch = test1.getCode();
		    switch(ch){
		    	case 'e': 	cod = "Engineer";
		    				d = 20000;
		    				break;
		    	case 'c' : 	cod = "Consultant";
		    				d = 32000;
		    				break;
		    	case 'k':	cod = "Clerk"; 
		    				d = 12000;
		    				break;
		    	case 'r':	cod = "Recption";
		    				d = 15000;
		    				break;
		    	case 'm':   cod ="Manager";
		    				d = 40000;
		    				break;
		    }
		    //System.out.println("id  ");  
		    long k = test1.getSalary()+d;
		    System.out.println("Emp no  "+"Emp name   "+ "   Department"+"     Designation "+"      Salary");
		    System.out.println(id + "    "+ test1.gets1()+"        "+ test1.getDept()+"        "+cod+"        "+ k);
		    //String k1 = "  "+3;
		    //System.out.println("hello"+k1+"jj");
		} 
		}
}
class myclass{
    String s1;
    char code;
    String dept;
    int basic;
    int hra;
    int it;
    public myclass(String s1,char code,String dept,int basic,int hra,int it){
        this.s1 = s1;
        this.code = code;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
    public String gets1(){
        return s1;
    }
   
    public char getCode(){
        return code;  
    } 
    public String getDept(){
    	return dept;
    }
    public int getBasic(){
    	return basic;
    }
    public int getHra(){
    	return hra;
    }
    public int getIt(){
    	return it;
    }
    public long getSalary(){
    	return hra+basic+it;
    }
}
