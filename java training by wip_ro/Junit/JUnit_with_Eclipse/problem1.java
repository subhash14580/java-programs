import java.util.*;
class problem1{
	public static String stringConcate(String s1,String s2){
		return s1+s2;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		System.out.println(stringConcate(s1,s2));
	}
}