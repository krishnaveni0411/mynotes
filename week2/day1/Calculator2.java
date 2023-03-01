package week2.day1;
// return the value
public class Calculator2 {
	public int add(int a, int b)
	{
		int c =a+b;
		return c;
		}
	public void sub(int a, int b) {
		int c=a+b;
		System.out.println("\n the sub value: "+ c);
	}
	public int mulitple(int a, int b)
	{
		int c =a+b;
		return c;
		}
	public void division(int a, int b) {
		int c=a+b;
		System.out.println("\n the division value: "+ c);
	}
	public static void main(String[] args) {
		Calculator2 cal=new Calculator2();
		int total = cal.add(20,30);
		System.out.println(" the addition value :" +total);
		cal.sub(total, 30);
		int total1=cal.mulitple(30,6);
		System.out.println("\n the multiple value :" +total1);
		cal.division(total, 5);
	}
} 
