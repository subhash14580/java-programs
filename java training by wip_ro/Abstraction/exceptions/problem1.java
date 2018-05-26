import java.lang.*;
class problem1{
	public static void main(String args[]){
	try{
	int n = Integer.parseInt(args[0]);
	System.out.println((int)Math.pow(n,2));
	}
	catch(Exception e){
		System.out.println("entered string is not a valid format");
	}
	}
}