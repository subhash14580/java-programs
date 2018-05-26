import java.util.*;
/*
 Create an ArrayList which will be able to store only Strings. Create a
  printAll method which will print all the elements using an Iterator.
 */
public class problem3 {
	public static void printAll(ArrayList al){
		ListIterator li = al.listIterator();
		while(li.hasNext()){
			String s = (String)li.next();
			System.out.println(s);
		}
	}
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no strings");
		int test = in.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		while(test-- != 0){
			al.add(in.next());
		}
		printAll(al);
	}
}
