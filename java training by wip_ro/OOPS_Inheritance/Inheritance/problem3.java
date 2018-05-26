class person1{
        public void callMe(){
        	System.out.println("super class is called with subclass object");
        }
 }
 class Student extends person1{
 		int id;
 		char gender;
 		public Student(){
 			id = 123;
 			gender = 'm';
 		}
 }
 class Teacher extends person1{
 	int salary= 10000;
 	String subject = "JAVA_Inheritence";

 }
class CollegeStudent extends Student{
		int year;
		String major;
		CollegeStudent(int yr,String mjr){
			year = yr;
			major = mjr;
		}

}
class problem3{
	public static void main(String args[]){
            CollegeStudent cs = new CollegeStudent(1996,"Communications");
           	System.out.print(cs.year+" "+cs.major+"  ");
           	System.out.println(cs.id+" "+cs.gender+" ");
           	cs.callMe();
	}
}