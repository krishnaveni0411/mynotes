package week2.day2;

public class SwappingTwoNumberWithoutThirdVariable {
	public static void main(String[] args) {
		int a=50;
		int b=100;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
}
