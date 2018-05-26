import java.io.*;
import java.util.Scanner;
class problem9{
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
       char input = in.next().charAt(0);
       switch(input){
         case 'R':
                  System.out.println("Red");
                  break;
         case 'B':
                  System.out.println("Blue");
                  break;
         case 'G':
                  System.out.println("Green");
                  break;
         case 'O':
                  System.out.println("Red");
                  break;
         case 'Y':
                  System.out.println("Red");
                  break;
         case 'W':
                  System.out.println("White");
                  break;
         default:  
                  System.out.println("Invalid code");
                  break;

       }
	}
}