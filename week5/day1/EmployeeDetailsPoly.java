package week5.day1;

public class EmployeeDetailsPoly {
	public void getEmployeeDetails(String name) {
		System.out.println("Student Name :" + name);
	}
	public void getEmployeeDetails(int registerNumber) {
		System.out.println("Student Number :" +registerNumber);
	}
	public void getEmployeeDetails(int registerNumber ,String name) {
		System.out.println("Student Name :" + name + " Student Number :" +registerNumber );
	}
	public void getEmployeeDetails(long mobileNumber) {
		System.out.println("Student MobileNumber :" + mobileNumber);
	}
	
	public static void main(String[] args) {
		EmployeeDetailsPoly details=new EmployeeDetailsPoly();
		details.getEmployeeDetails("kumar");
		details.getEmployeeDetails(1002);
		details.getEmployeeDetails(9632580140l);
		details.getEmployeeDetails(1022, "anil");
		

		
	}
}
