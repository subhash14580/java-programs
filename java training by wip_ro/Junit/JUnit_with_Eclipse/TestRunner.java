import junit.test;
import static junit.Assert.assertEquals;
class TestRunner{
	@Test
	public void test1(){
		assertEquals("Result","abcXYZ",stringConcate("abc","XYZ"));
	}
}