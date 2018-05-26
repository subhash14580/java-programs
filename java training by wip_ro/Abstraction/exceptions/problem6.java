/*
Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range 
(i.e. other than in the range of 0-100)
*/
import java.util.*;
class problem6{
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		int subj = 2,avg,i = 0;
		try{
		while(subj-- != 0){
			System.out.println("enter the student details1" + i);
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int num3 = in.nextInt();
			if((num1 < 0 || num1 > 100) || num2 < 0 || num2 >100||num3 >100 ||num3 < 0){
				throw new NumberFormatException();
			}
			avg = (num1+num2+num3)/3;
			System.out.println("average marks of student marks"+i+" is "+avg);
			i++;
			
		}
	}catch(NumberFormatException e){
		System.out.println("enter the student details1 correctly");
	}

	}
}