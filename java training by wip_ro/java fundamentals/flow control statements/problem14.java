import java.io.*;
import java.util.Scanner;
class problem14{
  public static void main(String args[]){
      //Scanner in = new Scanner(System.in);
      if(args.length != 0 ){
           int n = Integer.parseInt(args[0]);
      if(n == 1 ||n ==0){
        System.out.println(n + "is neither prime nor composite");
      }else{
       int flag = 1;
       for(int i = 2;i < n/2;i++){
         if(n % i == 0){
            flag = 0;
            break;
         }
       }
       if(flag == 0) System.out.println(n + "not prime");
       else System.out.println(n + " yes it is prime");
     }}
     else{
          System.out.println("please enter the number");
     }
  }
}