import java.io.*;
import java.util.Scanner;
class problem3{
	public static void main(String args[]){
	    int len = args.length;
	    int i = 0;
	    if(len == 0){
	    	System.out.println("No values");
	    }
	    else{
	    	while(i != len){
	    		System.out.print(args[i]);
	    		i++;
	    		if(i != len){
	    			System.out.print(",");
	    		}
	    		else{ break;}
	    		
	    	}
	    }
	}
}