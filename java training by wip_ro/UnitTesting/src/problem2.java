import java.util.*;
public class problem2 {
	public static String concate(String s1,String s2){
		return s1+s2;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		System.out.println(concate(s1,s2));
	}
}
