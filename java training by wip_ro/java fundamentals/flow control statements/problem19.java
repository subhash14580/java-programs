import java.util.*;
class problem19{
	public static void main(String args[]){
	    int n1 = Integer.parseInt(args[0]);
	     int sum = 0;
	     while(n1 != 0){
	     	 sum = sum + n1%10;
	     	 sum = sum*10;
	     	 n1 = n1/10;
	     }
	     System.out.println((sum/10)+ "  is a palindrome");
	}
}