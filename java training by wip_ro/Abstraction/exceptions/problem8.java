/*
Write a program to accept name and age of a person from the
 command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 
The program must exit gracefully after displaying the error message in case the arguments passed are not proper. 
(Hint : Create a user defined exception class for handling errors.)
*/
class AgeValidException extends Exception{
	AgeValidException(int age){
		System.out.println("enter the age only in the range of 18 to 60"+" not this "+age);
	}
}
class problem8{
	public static void main(String args[]){
		try{
		int age = Integer.parseInt(args[1]);

		if(age >= 18 && age <60){
			System.out.println("you are younger");
		}
		else{
			throw new AgeValidException(age);
			}
		}catch(AgeValidException e){

		}
	
	}
}