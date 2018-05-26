import java.io.*;
import java.util.Scanner;
class problem2{
	public static void main(String args[]){
	    System.out.println("enter the number ::");
         Scanner in = new Scanner(System.in);
         int  i = in.nextInt();
         if(i%2 == 0) 
            System.out.println("even number");
         else
            System.out.println("odd number");
	}
}