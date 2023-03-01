package week2.day1;

public class Calculator {
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
public void sub() {
	int a=30;
	int b=25;
	int c=a-b;
	System.out.println(c);
}
public void multiple( ) {
	int a=15;
	int b=3;
	int c=a*b;
	System.out.println(c);
}
public void division() {
	int a=15;
	int b=3;
	int c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add();
	cal.sub();
	cal.multiple();
	cal.division();
}
}

