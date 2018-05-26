import java.util.Scanner;
class problem18{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int n1 = 0;
		while(n != 0){
			n1 = n1 + n%10 * 10;
			n = n/10;
		}
		System.out.println(n1/10);
	}
}
