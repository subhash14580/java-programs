import java.util.*;
public class problem4 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		ArrayList<DifferentDataTypes> al = new ArrayList<>();
		al.add(new DifferentDataTypes(1,1.5f,1.00001));
		System.out.println(al.get(0).i);
		System.out.println(al.get(0).d);
	}
}
class DifferentDataTypes{
	public int i;
	float f;
	double d;
	public DifferentDataTypes(int i,float f,double d){
		this.i = i;
		this.f = f;
		this.d = d;
	}
}
