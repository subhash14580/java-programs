import java.util.Scanner;
/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice suitable to the type of the compartment.
Create a class TestCompartment . Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
*/
abstract class Compartment{
	abstract void notice();
}
class FirstClass extends Compartment{
	void notice(){
		System.out.println("this boggy for first class");
	}
}
class Ladies extends Compartment{
	void notice(){
		System.out.println("this boggy for ladies ");
	}
}
class General extends Compartment{
	void notice(){
		System.out.println("this boggy for General");
	}
}
class Luggage extends Compartment{
	void notice(){
		System.out.println("this boggy for Luggage");
	}
}
class problem2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the boggy number in the range 1 to 10");
		int no = in.nextInt();
		if(no <= 10 && no > 0){
			Compartment ct ;
			 
				if(no == 1){ 
						ct = new Ladies();
						ct.notice();
						//break;
						} 
				else if(no == 2){
						ct = new Luggage();
						ct.notice();
					    }
				else if(3 >= no && no <= 6){
						ct = new General();
						ct.notice();
				}
				else{
						ct = new FirstClass();
						ct.notice();
				}
 
			}
		}
	}
