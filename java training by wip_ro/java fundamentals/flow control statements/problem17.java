import java.util.Scanner;
class problem17{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		while(n != 0){

			System.out.print(n%10);
			n = n/10;
			
		}
	}
}
