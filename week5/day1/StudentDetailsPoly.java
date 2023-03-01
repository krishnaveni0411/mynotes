package week5.day1;

public class StudentDetailsPoly {
public void getStudentDetails(String name) {
	System.out.println("Student Name :" + name);
}
public void getStudentDetails(int registerNumber) {
	System.out.println("Student Number :" +registerNumber);
}
public void getStudentDetails(int registerNumber ,String name) {
	System.out.println("Student Name :" + name + " Student Number :" +registerNumber );
}
public void getStudentDetails(long mobileNumber) {
	System.out.println("Student MobileNumber :" + mobileNumber);
}
public static void main(String[] args) {
	StudentDetailsPoly details=new StudentDetailsPoly();
	details.getStudentDetails("kumar");
	details.getStudentDetails(1002);
	details.getStudentDetails(9632580140l);
	details.getStudentDetails(1022, "anil");
	

	
}

}
