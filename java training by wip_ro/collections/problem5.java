import java.util.*;

public class problem5 {
	public static boolean search(ArrayList<DB> al,String s){
		for(int i = 0;i < al.size();i++){
			if((al.get(i).name).equals(s) == true){
				System.out.println("yes employee exits");
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		ArrayList<DB> al = new ArrayList<DB>();
		al.add(new DB("subhash","bhimavaram",50000));
		al.add(new DB("tarak","pedhapuram",40000));
		al.add(new DB("balu","guntur",449456));
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(search(al,s));
	}
}
class DB{
	String name;
	String address;int sal;
	public DB(String name,String address,int sal){
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
}