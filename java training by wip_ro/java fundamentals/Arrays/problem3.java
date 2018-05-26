import java.util.Scanner;
class problem3{
	public static void main(String args[]){
	int a[] = {1,4,34,56,7};
	int n = Integer.parseInt(args[0]);
	int i;
	for( i = 0;i < a.length;i++){
		if(n == a[i]){
			break;
		}
	}
 	if(i == a.length){
 		System.out.println(-1);
 	}
 	else{
	System.out.println("index is " + i);
	}	
}
}