import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class problem5 {
	public static void main(String args[]) throws Exception{
	int a[] = {97,69,71,100,1};
	Arrays.sort(a);
	System.out.println(" LARGEST :: first : "+a[a.length-1] + " second "+ a[a.length -2 ]);
	System.out.println("SMALLEST :: first : "+a[0] + " second "+ a[1]);
 }
}