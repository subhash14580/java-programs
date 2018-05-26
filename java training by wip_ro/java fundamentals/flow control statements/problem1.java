import java.io.*;
import java.util.Scanner;
class problem1{
	public static void main(String args[]){
	    System.out.println("enter the number ::");
         Scanner in = new Scanner(System.in);
         int  i = in.nextInt();
         if(i < 0) {
         	System.out.println("negative");
         }
         else if(i > 0){
         	System.out.println("positive");
         }
         else{
         	System.out.println("zero");
         }

	}
}