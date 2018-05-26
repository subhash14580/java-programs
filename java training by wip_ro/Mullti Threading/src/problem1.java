import java.lang.Thread;
public class problem1 extends Thread {
	@Override
	public void run(){
		for(int i = 0;i < 10;i++){
		System.out.println(getName());
		
		try{
			System.out.println("heyy guess what");
		sleep(1000);
		}catch(InterruptedException e){
		e.printStackTrace();
		//System.out.println("hey guess what");
		}
		}
	}
	public static void main(String args[]){
		problem1 t1 = new problem1();
		problem1 t2 = new problem1();
		t1.setName("thread1111");
		t2.setName("thread2222");
			t1.start();
		
			t2.start();
	}
}
