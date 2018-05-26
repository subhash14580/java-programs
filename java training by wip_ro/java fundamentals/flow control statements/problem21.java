import java.util.*;
class problem21{
	public static void main(String args[]){
	    
	    Scanner in = new Scanner(System.in);
	    //char continue;
	    while(true){
	    	System.out.println("pick an option ::\n 1.Addition\n 2.Subtraction");
	    	int option = in.nextInt();
	    	if(option < 1 && option > 2){
	    		System.out.println("Invalid option ");
	    	}
	    	else{
	    	System.out.println("enter the numbers ");
	    	int n1 = in.nextInt();
	    	int n2 = in.nextInt();
	    	switch(option){
	    		case 1: System.out.println(n1+n2); break;
	    		case 2: System.out.println(Math.abs(n1-n2)); break;
                      
	    		}
	    	}
	    	System.out.println("do u want to continue :: yes/no");
            String cont = in.next();
            if(cont.equals("no") == true){
            	break;
            }
            //int i = in.nextInt();
            //if(i == 0){
            //	break;
            //}

	    }
}   }