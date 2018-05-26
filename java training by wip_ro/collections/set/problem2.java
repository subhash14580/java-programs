package set;
/*
 * Write a program to store a group of employee names into a HashSet, 
 * retrieve the elements one by one using an Iterator.
 */
import java.util.*;
public class problem2 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		HashSet<String> s = new HashSet<String>();
		int no = in.nextInt();
		while(no-- != 0){
			String s1 = in.next();
			s.add(s1);
		}
		//s.add("a");
		System.out.println(s);
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
