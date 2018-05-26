import java.io.*;
import java.util.Scanner;
class problem5{
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    char i = in.next().charAt(0);
	    if((i >= 'a' && i<= 'z')||(i >= 'A' && i <= 'Z')){
			System.out.println("Alaphabet");

		}
		else if(i <= '9' && i >= '0'){
				System.out.println("Digit");

		}
		else{
			System.out.println("Special Character");

		}
	}
}