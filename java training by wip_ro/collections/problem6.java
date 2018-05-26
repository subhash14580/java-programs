/*
 Develop a java class with a method saveEvenNumbers(int N) using ArrayList 
 to store even numbers from 2 to N, where N is a integer 
 which is passed as a parameter to the method saveEvenNumbers().  
The method should return the ArrayList (A1) created. 
In the same class create a method printEvenNumbers()which iterates through 
the arrayList A1 in step 1,  and It should multiply each number with 2 and
 display it in format 4,8,12�.2*N.
  and add these numbers in a new ArrayList (A2). 
The new ArrayList (A2) created needs to be returned.
 Create a method printEvenNumber(int N)  parameter is a number N. 
 This method should search the arrayList (A1) for the existence of the number 
 �N� passed.  
 If exists it should return the Number else return zero.
 Hint:  Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.
 */
import java.util.LinkedList;
import java.util.Scanner;
class problem6{
	
	public static void saveEvenNumbers(int N){
		LinkedList al = new LinkedList();	
		for(int i = 2;i <= N;i += 2){
			al.add(i);
		}
		printEvenNumber(al);
	}
	public static void printEvenNumber(LinkedList al){
		LinkedList al2 = new LinkedList();
		int sz = al.size();
		int temp = 0;
		for(int i = 0;i < sz;i++){
			temp = (Integer)al.get(i);
			al2.add(temp*2);
		}
		
		System.out.println(al2);
		al2.removeFirst();
		System.out.println(al2);
		al2.removeLast();
		al2.remove(1);
		al2.add(122222);
		System.out.println(al2);
		al2.remove(2);
		System.out.println(al2);
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int n = in.nextInt();
		
		saveEvenNumbers(n);
		
	}
	
}