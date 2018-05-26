import java.lang.Runnable;
import java.util.Random;
/*
 *  store colours in the form of an array
ex: String colours[]={"white","blue","black",
"green","red","yellow"};
display all colours repeatedly by 
generating colour index from Random class.
 If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
 */
public class problem2 implements Runnable{
	String colours[]={"white","blue","black","green","red","yellow"};
	Random index = new Random();
	public void run(){
		while(true){
		int n = index.nextInt(6);
		if(colours[n].equals("red")){ 
			break;
		}
		else{
			System.out.println(colours[n]+n);
		}
	}
	}
	public static void main(String args[]){
		problem2 t = new problem2();
		Thread t1 = new Thread(t);
		t1.start();
	
		
	}
}
