package week2.day1;
// How to pass an argument from main function or methods to methods
public class Calculator1 {
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("\n Addition : " +c);
	}
public void sub(int a, int b) {
	int c=a-b;
	System.out.println("\n Sub : " +c);
}
public void multiple( int a, int b) {
	int c=a*b;
	System.out.println("\n Multiple : " +c);
}
public void division(int a, int b) {
	int c=a/b;
	System.out.println("\n Division : " +c);
}
public static void main(String[] args) {
	Calculator1 cal=new Calculator1();
	cal.add(20,40);
	cal.sub(307,60);
	cal.multiple(407,63);
	cal.division(15,3);
	cal.add(26,42);
	cal.sub(350,69);
	cal.multiple(425,69);
	cal.division(50,5);
	cal.add(278,43);
	cal.sub(33,69);
	cal.multiple(46,66);
	cal.division(15,5);
	cal.add(24,47);
	cal.sub(34,65);
	cal.multiple(49,64);
	cal.division(45,9);
	cal.add(24,43);
	cal.sub(34,69);
	cal.multiple(43,65);
	cal.division(9,3);
	cal.add(22,48);
	cal.sub(34,68);
	cal.multiple(47,60);
	cal.division(35,7);
}

}
