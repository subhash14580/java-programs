import java.util.*;
class problem4{
	public static void main(String args[]) throws Exception{
	
		//Scanner in = new Scanner(System.in);
	int n = args.length;
    int a[] = new int[n];
    for(int i = 0;i < n;i++){
    	//String k = in.next();
    	a[i] = Integer.parseInt(args[i]);
    }
    //int index = in.nextInt();
	//System.out.println(a[index] +"is accessed");
	int  sum = 0;
	for(int i = 0;i < n;i++){
		sum += a[i];
	}
	int avg = sum/n;
	System.out.println("sum is "+sum+"avg is "+avg);
	
	}
}