/*
Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
Piano is playing  tan tan tan tan    for Piano class
Flute is playing  toot toot toot toot  for Flute class
Guitar is playing  tin  tin  tin   for Guitar class 
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print that which object stored at which index of instrument array.
*/
//import java.util.*;
abstract class Instrument{
	abstract void play();
}
class Piano extends Instrument{
	void play(){
		System.out.println("Piano ");
	}
}
class Flute extends Instrument{
	void play(){
		System.out.println("Flute");
	}
}
class Guitar extends Instrument{
	void play(){
		System.out.println("Guitar");
	}
}
/*
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print that which object stored at which index of instrument array.

*/
class problem3 {
	public static void main(String args[]){
		
		Instrument s;
		/*
		s = new Piano();
		s.play();
		s = new Flute();
		s.play();
		s = new Guitar();
		s.play();
		
		
		Piano p = new Piano();
		Guitar g = new Guitar();
		Flute f = new Flute();
		*/
		Instrument[] arr = {new Piano(),new Flute(),new Guitar(),new Piano(),new Guitar(),
			new Piano(),new Flute(),new Flute(),new Piano()};
		for(int i = 0; i < 9;i++){
			if(arr[i] instanceof Piano){
				System.out.println(i +"is object of piano");
				arr[i].play();
			}
			else if(arr[i] instanceof Guitar){
				System.out.println(i+"is object of Guitar");
				arr[i].play();
			}
			else{
				System.out.println(i+"is object of Flute");
				arr[i].play();
			}
		}
		
	}
}