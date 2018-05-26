//import java.util.Scanner;

class problem7{
	public static void main(String args[]) throws Exception{
	
	int a[] = {10,20,10,30,40,100,99,99,101};
	for(int i = 0; i < a.length;i++){
		for(int j = i+1;j < a.length;j++){
			if(a[i] != -1){
				if(a[i] == a[j]){
					a[j] = -1;
				}
			}
		}
	}
	for(int i = 0;i < a.length;i++){
		if(a[i] != -1){
			System.out.print(a[i]+" ");
		}
	}

 }
}