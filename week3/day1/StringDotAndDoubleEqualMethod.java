package week3.day1;

public class StringDotAndDoubleEqualMethod {
	public static void main(String[] args) {
		String name1="krishnaveni";
		String name2="krishnaveni";
		System.out.println("dot equal method with the string of string literal\n");
		if (name1.equals(name2)) {
			System.out.println("the given string is equal" + name1);
		} else 
		{
			System.out.println("the given string is not equal");
		}
		String name3=new String("Krishnaveni");
		String name4=new String("Krishnaveni");
		System.out.println("dot equal method with the string of new keyword\n");
		if (name3.equals(name4)) {
			System.out.println("the given string is equal" + name1);
		} else 
		{
			System.out.println("the given string is not equal");
		}
		System.out.println("double equal method with the string of string literal\n");
		if (name1==name2) {
			System.out.println("the given string is equal" + name1);
		} else 
		{
			System.out.println("the given string is not equal");
		}
		System.out.println("double equal method with the string of new keyword\n");
		if (name3==name4) {
			System.out.println("the given string is equal" + name1);
		} else 
		{
			System.out.println("the given string is not equal");
		}
	}
}
