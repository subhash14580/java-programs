
import java.util.*;
class InvalidCountryException extends Exception{
	InvalidCountryException(){
		System.out.println("User outside india cant be registered");
	}
}
class problem7{
	public static void registerUser(String username,String userCountry) {
		try{
		if(userCountry.equals("India")){
			System.out.println("User registration done successfully");
		}
		else{
			throw new InvalidCountryException();
		}
		}catch(InvalidCountryException e){
			
		}
	}
	public static void main(String args[])throws Exception{
		Scanner in = new Scanner(System.in);
	
		String name = in.next();
		String country = in.next();
		registerUser(name,country);
	
	}
}