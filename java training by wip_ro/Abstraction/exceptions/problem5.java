import java.util.*;
class problem5{
    public static int me(int m,int n) {
    	int k = m/n;
    	//if(n == 0)
    	//throw new ArithmeticException();
    	return k;

    }
	public static void main(String args[]) throws ArithmeticException{
	
			Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    
   	 	int m = in.nextInt();
   	 	try{
   	 	System.out.println(me(n,m));
   	 	throw new ArithmeticException("hello");
    	}catch(ArithmeticException e){
    		System.out.println("caughted the Exception   "+e);
    	}
	}
}