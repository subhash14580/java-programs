import java.util.Scanner;
class problem2{
	public static void main(String args[]){
	int a[] = {3,5,6,8,10,1};
	int i = 1;
	int max = a[0],min = a[0];
 	while(i < a.length){
        if(max < a[i]){
        	max = a[i];
        }
        if(min > a[i]){
        	min = a[i];
        }
		i++;
	}
	System.out.println("minimum is "+min + " maximum is "+max);
	
}
}