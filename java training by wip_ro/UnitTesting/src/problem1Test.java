import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class problem1Test {

	@Test
	public void test() {
		problem1 p1 = new problem1();
		ArrayList<String> s = new ArrayList<String>();
		s.add("subhash");
		s.add("balu");
		s.add("yo yo");
		assertEquals("FOUND",p1.findName(s,"subhash"));
		checkPalin cp = new checkPalin();
		assertEquals(true,cp.check("madam"));
	}	
}
