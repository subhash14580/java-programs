import java.util.Scanner;
class problem2{
	public static void main(String args[]){
		System.out.println("enterr the no of inputs");
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		String s1,s2;
			s1 = in.next();
			s2 = in.next();

			if(s1.endsWith(""+s1.charAt(s1.length()-1)) == s2.startsWith(""+s2.charAt(0))){
				s1 = s1.substring(0,s1.length()-1);

			}
			System.out.println(s1+s2);

	}
}