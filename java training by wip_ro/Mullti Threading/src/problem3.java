import java.lang.Thread;
/*
 *  Create class of SalesPersons as a thread that will display
 *      fives sales persons name.
2. Create a class as Days as other Thread that has array of seven days.
3. Call the instance of SalesPersons in Days and start both the 
  threads
4. suspend SalesPersons on Sunday and resume on wednesday 
Note: use suspend, resume methods from thread
 */
public class problem3 extends Thread {
	String names[] ={"name1","name2","name3","name4","name5"};	
	public void run(){
			for(String s : names){
				System.out.println(s);
			}
		}
	
}
public class problem11 extends Thread{
	String days[] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	public problem3 t1;
	public problem3 p3;
	public void run(){
		for(String s : days){
			if(s.equals("sunday")){
				t1.suspend();
			}
			if(s.equals("sunday")) t1.resume();
		}
	}
	
	public static void main(String args[]){
		t1 = new problem3();
		 p3 = new problem3();
		
	}
	
}