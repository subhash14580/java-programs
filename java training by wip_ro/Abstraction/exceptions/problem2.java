import java.util.*;
class problem2{
	public static void main(String args[]){
	try{
		Scanner in = new Scanner(System.in);
	int n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0;i < n;i++){
    	a[i] = in.nextInt();
    }
    int index = in.nextInt();
	System.out.println(a[index] +"is accesse");
	}
	catch(Exception e){
		System.out.println("index out of range");
	}
	}
}