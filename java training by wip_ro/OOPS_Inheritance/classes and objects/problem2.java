import java.lang.*;
class Calculator{
	//int num1,num2;
	public static double powerDouble(double num1,double num2){
		return Math.pow(num1,num2);
	}
	public static long powerInt(int num1,int num2){
		int result = 1;
		while(num2-- != 0 ){
			result = num1 * result;
		}
		return result;
	}
}
class problem2{
	public static void main(String args[]){
		System.out.println(Calculator.powerDouble(2111,3));
		System.out.println(Calculator.powerInt(2,111));
	}
}