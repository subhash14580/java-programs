import java.util.Scanner;
class problem5{
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.substring(1,sb.length()-1));
	}
}