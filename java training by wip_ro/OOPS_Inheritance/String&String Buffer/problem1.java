//import java.util.Scanner;
class problem1{
   public static void main(String args[]){
   	//StringBuffer n = new StringBuffer(args[0]);
   	//System.out.println(n.reverse());
    String n1 = args[0];
    int i,j;
    int len = args[0].length(),flag = 0;
    for(i = 0,j = len-1;i < len && j>= 0;i++,j--){
    	if(n1.charAt(i) != n1.charAt(j)){
            flag = 1;
            System.out.println("not a palindrome");
            break;
    	}
    }
    if(flag == 0) System.out.println("palindrome");
   }
}