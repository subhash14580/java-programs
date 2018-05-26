import java.io.*;
import java.util.Scanner;
class problem8{
	public static void main(String args[]){
	    //System.out.println("enter the number ::");
         //String output = "";
         Scanner in = new Scanner(System.in);
         char alpha = in.next().charAt(0);
         int ch = (int)alpha;
         if( ch >= 65 && ch <= 90){
             ch  =  (ch + 32);

            System.out.println((char)ch);
         }
         else{
            ch  = ch -32;
            System.out.println((char)ch);
         }

	}
}