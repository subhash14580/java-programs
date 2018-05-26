import java.util.Scanner;
class problem4{
	public static void main(String args[]){
		//System.out.println("enterr the no of inputs");
		Scanner in = new Scanner(System.in);
		//int test = in.nextInt();
		String s1,s2;
			s1 = in.next();
			System.out.println(check(s1));
	}
	public static String check(String inp)
	{
		int len = inp.length();
			if(len % 2 != 0){
			       	return null;
			}
			else{
                return inp.substring(0,len/2);
			}
	}
}