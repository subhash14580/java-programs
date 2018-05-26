import java.lang.*;
public class problem32 implements Runnable{
	 @Override
	 public void run(){
		 try{
			 
		 
		 for(int i = 1;i <= 10;i = i +2 ){
			 System.out.println(1);
			 
		 }
		
		 
		 }catch(InterruptedException e){
			 e.printStackTrace();
		 }
	 }
	public static void main(String args[]){
		problem32 t = new problem32();
		Thread t_1 = new Thread(t);
		problem32 t2 = new problem32();
		Thread t_2 = new Thread(t2);
		t_1.start();
		t_2.start();
		try{
		t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
