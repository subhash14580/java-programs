import java.util.*;

public class problem1 {
	public String findName(ArrayList employees,String name){
		  String result="";
		  if(employees.contains(name)){
		   result="FOUND";
		  }else{
		   result="NOT FOUND";
		  }
		  return result;
		 }
}
