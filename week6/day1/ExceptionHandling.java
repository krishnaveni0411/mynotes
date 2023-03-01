package week6.day1;

public class ExceptionHandling {
public static void main(String[] args) {
	int a=10;
	int b=0;
try {
 int c=a/b;
}catch (Exception e) {
	// e.printStackTrace();
		System.out.println(e);
}
	System.out.println("Exception Handling");
	 
}
}
 