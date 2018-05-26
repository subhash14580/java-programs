import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.*;

import org.junit.Test;

public class projectTestTest {
	public static void main(String args[]){
		Result rs = JUnitCore.runClasses(projectTest.class);
		for (Failure failure : rs.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	   if(rs.wasSuccessful() == true){
		   System.out.println("all tests are passed");
	   }
	}
}
