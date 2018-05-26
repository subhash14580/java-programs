//import java.util.Scanner;

class problem10 {
	public static void main(String args[]) throws Exception{
	if(args.length != 4){
		System.out.println("please enter  4 digits only");

	}
	else{
	int arr[][] = new int[2][2];
	int k = 0;
	System.out.println("the given array is :");
	for(int i = 0;i < 2;i++){
		for(int j = 0;j < 2;j++){
			arr[i][j] = Integer.parseInt(args[k]);
			System.out.print(arr[i][j]+" ");
			k++;
		}
		System.out.println();
	}
	System.out.println("the reverse of an array is :");
	for(int i = 1;i >= 0;i--){
		for(int j = 1;j >= 0;j--){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

 }
}