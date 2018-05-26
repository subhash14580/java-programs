/*
 * File Word Count
Implement a code to count the occurrences of each word in an input file and write the word along with corresponding count in an output file sorted by the words alphabetically. 
(Hint : Use Map as an intermediate collection)
Sample Input
inputFile.txt
Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro
Sample Output
D:\>Java FileWordCount inputFile.txt outputFile.txt
outputFile.txt
Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
 */
import java.util.*;
import java.io.*;
public class problem3 {
	public static void main(String args[]) throws IOException{
		Scanner in1 = new Scanner(System.in);
		String s1 = in1.next();
		String s2 = in1.next();
		BufferedReader bf = new BufferedReader(new FileReader(s1));
	//FileReader in = new FileReader(args[0]);
	FileWriter out = new FileWriter(s2);
	TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
	
	int a ;
	char c;
	String temp = "",t = "";
	while((t = bf.readLine()) != null){
	      String arr[] = t.split(" ");
	      for(int i = 0;i < arr.length;i++){
	    	  if(hm.containsKey(arr[i]) == false ){
	    		  hm.put(arr[i],1);
	    	  }
	    	  else {
	    		  hm.put(arr[i],hm.get(arr[i])+1);
	    	  }
	      }
	      
	}
	Set et = hm.entrySet();
	Iterator it = et.iterator();
	while(it.hasNext()){
		Map.Entry me = (Map.Entry)it.next();
		out.write(me.getKey()+" : "+me.getValue()+"\n");
	}
		System.out.println(hm);
	bf.close();
	out.close();
	}
}
