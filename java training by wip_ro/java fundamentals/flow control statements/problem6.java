import  java.util.Scanner;
import java.io.*;
class problem6{
	public static void main(String args[]){
		int age = Integer.parseInt(args[1]);
		if(args[0].equals("male") == true){
			if( age >= 1 && age <= 60) System.out.println(9.2+"%");
			else if(age >= 61&& age<= 120) System.out.println(8.3+"%");
		}
		else{
			if( age >= 1 && age<= 58) System.out.println(8.2+"%");
			else if(age >= 59 && age <= 120) System.out.println(7.6+"%");
		}


	}
}