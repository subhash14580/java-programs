package set;
/*
 * Create Collection called TreeSet which is 
 * capable of storing String objects. 
 * The Collection should have the following capabilities
a)Reverse the elements of the Collection 
b)Iterate the elements of the TreeSet 
c) Checked if a particular element exists or not
 */
import java.util.*;
public class problem3 {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Set<String> s = new TreeSet<String>();
		int no = in.nextInt();
		while(no-- != 0){
			String s1 = in.next();
			s.add(s1);
		}
		Iterator it = s.descendingIterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(s);
		if(s.contains("subhash")){
			System.out.println("yes yes yes");
		}
		else System.out.println("no no no");
		
	}
}
