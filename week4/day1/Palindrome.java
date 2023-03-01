package week4.day1;

public class Palindrome {
public static void main(String[] args) {
	String text="mom";
	String name= "";
	char[] charArray= text.toCharArray();
	for(int i=charArray.length-1; i>=0; i--) {
		name=name+charArray[i];
	}
	if(text.equals(name)) {
		System.out.println("The Given String is Palindrome");
	}else
		System.out.println("The Given String is not a Palindrome"); 
}
}
