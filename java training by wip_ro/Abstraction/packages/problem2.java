/*
Create a class called compartment which represents the ship compartments for watertight subdivision 
its height, width and breadth. 
Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
To avoid conflict create this class in a new package called com.wipro.automobile.ship 
*/
import com.wipro.automobile.ship.compartment;
class problem2{
      public static void main(String args[]){
      	compartment ct = new compartment();
      	System.out.println(ct.getHeight());
      }
}