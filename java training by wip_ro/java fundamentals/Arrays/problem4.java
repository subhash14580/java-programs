import java.util.Scanner;
class problem4{
	public static void main(String args[]){
	int a[] = {97,69,71,100};
	for(int i = 0;i < a.length;i++){
		System.out.print((char)a[i]);
		if(i < a.length - 1){
			System.out.print(" ");
		}
	}
}
}