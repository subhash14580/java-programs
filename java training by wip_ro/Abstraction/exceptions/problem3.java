import java.util.*;
class problem3{
	public static void main(String args[]){
	try{
		Scanner in = new Scanner(System.in);
	int n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0;i < n;i++){
    	String k = in.next();
    	a[i] = Integer.parseInt(k);
    }
    int index = in.nextInt();
	System.out.println(a[index] +"is accessed");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch (NumberFormatException e) {
		System.out.println("NumberFormatException");
	}

	}
}