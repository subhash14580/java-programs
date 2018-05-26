package set;
/*
 *  Create Collection called TreeSet which is capable of storing String objects. 
 *  The Collection should have the following capabilities
a)Reverse the elements of the Collection 
b)Iterate the elements of the TreeSet 
c) Checked if a particular element exists or not
*/
import java.util.*;
public class problem4 {
     public static void main(String args[]){
    	 TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
    String s[] = {"subhah","s2","s3"};
    for(int i = 0;i < s.length;i++){
    	ts.add(s[i]);
    }
    Iterator it = ts.iterator();
    while(it.hasNext()){
    	System.out.println(it.next().toString());
    	
    }
    if(ts.contains("s2")) System.out.println("yes it exists");
     }
}
