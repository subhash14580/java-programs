

package com.automobile.TwoWheeler;
import com.automobile.vehicle;
/*
Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create TwoWheeler subpackage under Automobile package
Hero  class extends  Automobile.vehicle class 
public int getSpeed() 
– Returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 
Honda class extends com.automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
Create a test class to test the methods available in all these child class.
*/
class Hero extends vehicle{
	public int getSpeed(){
		return 60;
	}
	public void radio(){
		System.out.println("provides");
	}
	public String getModelName(){return "n";};
 	public String getRegistrationNumber(){return "m";}; 
 	public String getOwnerName(){return "k";}; 
}
class Honda extends vehicle{
	public int getSpeed(){
		return 55;
	}
	public void cdplayer(){
		System.out.println("provides");
	}
	public String getModelName(){return "n1";};
 	public String getRegistrationNumber(){return "m1";}; 
 	public String getOwnerName(){return "k1";}; 
}
class problem3{
	public void main(String ags[]){
		Honda h = new Honda();
		h.cdplayer();
	}
}