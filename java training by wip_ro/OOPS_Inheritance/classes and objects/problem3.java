class Patient{
	double wt,ht;
	String name;
	public  Patient(double wt,double ht){
		this.wt = wt;
		this.ht = ht;
	}
	public double BMI(){
		double result = 0;
		result = (wt/(ht * ht))* 703;
		return result;
	}
}
class problem3{
	public static void main(String args[]){
 		Patient pt = new Patient(63,6.0);
 		System.out.println(pt.BMI());
	}
}