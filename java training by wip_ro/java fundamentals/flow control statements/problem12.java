import java.io.*;
import java.util.Scanner;
class problem12{
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int flag = 1;
       for(int i = 2;i < n/2;i++){
         if(n % i == 0){
            flag = 0;
            break;
         }
       }
       if(flag == 0) System.out.println("not prime");
       else System.out.println(" yes it is prime");

	}
}