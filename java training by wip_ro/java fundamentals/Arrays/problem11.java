//import java.util.Scanner;

class problem11 {
	public static void main(String args[]) throws Exception{
	if(args.length != 9){
		System.out.println("please enter  9 digits only");

	}
	else{
	int arr[][] = new int[3][3];
	int k = 0,max = -9999999;
	System.out.println("the given array is :");
	for(int i = 0;i < 3;i++){
		for(int j = 0;j < 3;j++){

			arr[i][j] = Integer.parseInt(args[k]);
			System.out.print(arr[i][j]+" ");
			if(max < arr[i][j]) max = arr[i][j];
			k++;
		}
		System.out.println();
		}
		System.out.println("the maximum number is " + max);
	
	}

 }
}