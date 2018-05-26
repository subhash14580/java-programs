
public class checkPalin {
	public static void main(String args[]){
		checkPalin c = new checkPalin();
		System.out.println(c.check("madam"));
	}
	public boolean check(String inp){
		StringBuffer bf = new StringBuffer(inp);
		StringBuffer k = new StringBuffer(inp);
		bf.reverse();
		if(k.toString().equals(bf.toString()) == true) return true;
		return false;
	}
}
