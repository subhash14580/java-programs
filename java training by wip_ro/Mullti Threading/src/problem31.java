import java.lang.*;
public class problem31 implements Runnable{
	 @Override
	 public void run(){
		 try{
			 
		 
		 for(int i = 1;i <= 10;i++){
			 System.out.println(1);
			 if(i == 5) Thread.sleep(5000);
		 }
		 }catch(InterruptedException e){
			 e.printStackTrace();
		 }
	 }
	public static void main(String args[]){
		problem31 t = new problem31();
		Thread t1 = new Thread(t);
		t1.start();
		
	}
}
