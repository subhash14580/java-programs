import java.util.Scanner;
class problem1{
	public static void main(String args[]){
	int a[] = {3,5,6,8,10};
	int sum = 0;
	for(int i = 0;i < a.length;i++){
		sum += a[i];
	}
	System.out.println("sum is " + sum);
	System.out.println("average is "+(sum/a.length));
}
}