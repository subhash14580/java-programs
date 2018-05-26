/*
Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. 
Use exception handling mechanisms to handle this exception.
 In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message Inside finally block.
Sample Input and Output 1:
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block
Sample Input and Output 2:
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block
*/
import java.util.*;
class problem9{
	public static void main(String args[]){
		try{
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		//Integer i = new Integer("10");
		System.out.println("the quotient of "+num1+"/"+num2+" = "+num1/num2+" ");
		}catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}finally{
			System.out.println("Inside finally block");
		}
	}
}