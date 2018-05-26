
//import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals; 
public class test1 {
	@Test
	public void tesing(){
		testedclass ts = new testedclass();
		assertEquals("assert is executed","abcXYZ",ts.concate("abc","XYZ"));
		assertEquals("hello",true,ts.checkEven(10));
	}
}
