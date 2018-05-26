import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class problem8 {
	public static void main(String args[]) throws Exception{
	int a[] = {10,20,10,30,40,100,99};
	int i,j,count = 0,index = 0,result =0 ;
	for(i = 0;i < a.length;i++){
		for(j = i+1;j <a.length;j++){
				if(a[i] == a[j]){
					count++;
				}
		}
		if(result < count){
			result = count;
			index = i;
		}
		count = 0;
	}
	System.out.println(a[index]);
	
 }
}