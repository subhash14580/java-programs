/*
Accept a integer number as Command line argument from the program and 
when the program is executed print the binary, octal and hexadecimal equivalent of the given number.

Sample Output:

java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14

Refer Java Documentation and look for the appropriate Wrapper class method
*/
class problem2{
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		System.out.println("Given Number is : "+i);
		System.out.println("Binary ::"+Integer.toBinaryString(i));
		System.out.println("octal ::"+Integer.toOctalString(i));
		System.out.println("hexadecimal ::"+Integer.toHexString(i));
	}
}