/*
1.1. Create a class called GeneralBank which acts as base class for all banks.
 This class has functionality getSavingInterestRate and getFixedInterestRate methods, 
 which return the saving a/c rate of interest 
and fixed account rate of interest the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, 
make it abstract.

1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods from base class. 
ICICI - Savings 4% Fixed 8.5% and KotMBank.  - Savings 6% Fixed 9%



*/
abstract class GeneralBank{
	int saving;
	int fixed;
	GeneralBank(int  saving,int fixed){
         this.saving =saving;
         this.fixed = fixed;
	}
	public void getSavingInterestRate(){
		System.out.println("hdfskhhshdhgk ");
	}

	abstract public void getFixedInterestRate();
}
class ICICIBank extends GeneralBank{
	ICICIBank(int saving,int fixed){
		super(saving,fixed);
	}
	@Override
	public void  getSavingInterestRate(){
		System.out.println(saving);
	}
	public void  getFixedInterestRate(){
		System.out.println(fixed);
	}
}
class KotMBank extends GeneralBank{
	KotMBank(int saving,int fixed){
		super(saving,fixed);
	}
	public void  getSavingInterestRate(){
		System.out.println(saving);
	}
	public void getFixedInterestRate(){
		System.out.println(fixed);
	}
}
/*
1.3. Create a main method to test the above classes. Try one by one and absorb your finding.
a) ICICIBank object reference instantiated with ICICIBank class.
b) KotMBank object reference instantiated with KotMBank class.
c) GeneralBank object reference instantiated with KotMBank class.
d) GeneralBank object reference instantiated with ICICIBank class.
*/
class problem1{
	public static void main(String args[]){
		ICICIBank ic = new ICICIBank(4,8);
		ic.getFixedInterestRate();
		ic.getSavingInterestRate();
		//KotMBank kt = new KotMBank();
		GeneralBank gb = ic;
		gb.getSavingInterestRate();
		gb.getFixedInterestRate();
	}
}