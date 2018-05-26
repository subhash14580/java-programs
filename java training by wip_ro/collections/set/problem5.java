package set;

/* assignment 1:::::::::::>>
 *  Develop a java class with a instance variable Country  HashSet (H1)  
 *  add a method saveCountryNames(String CountryName) , 
 *  the method should add the passed country to a HashSet (H1) and
 *   return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet
 and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*************---------------***********************
Implement the assignment 1 using TreeSet
 */
import java.util.Iterator;
import java.util.Collections;
import java.util.TreeSet;
public class problem5 {
	TreeSet<String> ts = new TreeSet<String>();
	 TreeSet saveCountry(String s1){
		 ts.add(s1);
	    return ts;	
	}
	 boolean getCountry(String n){
		 Iterator it = ts.iterator();
		 for(String s : ts){
			 if(ts.contains(n)) return true;
		 }
		 return false;
	 }
   public static void main(String args[]){
	 problem5 p5 = new problem5();
	 p5.saveCountry("subhash");
	 p5.saveCountry("subbu");
	 System.out.println(p5.getCountry("subhash"));
   }
}
