package set;
/*
 *  Develop a java class with a instance variable Country  
 *  HashSet (H1)  add a method saveCountryNames(String CountryName) , 
 *  the method should add the passed country to a HashSet (H1) and 
 *  return the added HashSet(H1).
Develop a method getCountry(String CountryName) 
which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
 */
import java.util.*;
public class problem1 {
	public static void saveCountry(String name,Set<String> hs){	
		hs.add(name);
		
	}
	public static void retrive(Set<String> s){
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Set<String> hs = new HashSet<String>();
		String name = in.next();
		//retrive(saveCountry(name));
		String name1 = in.next();
		//retrive(saveCountry(name1,hs));
		saveCountry(name,hs);
		saveCountry(name1,hs);
		retrive(hs);
		
		
	}
	
}
