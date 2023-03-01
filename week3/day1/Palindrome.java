package week3.day1;

public class Palindrome {
	/*  Declare the String 
	 * change the string into char array
	 * decrement for loop 
	 * declare the null string
	 * add the charter to the null string
	 * compare the two strings using dot equal method 
	 * if it is same print the two string as same
	 * else print two string is not same
	
	*/
	public static void main(String[] args) {
		String orginal = "madam";
		String rev ="";
		for(int i= orginal.length()-1; i>=0; i--)
		{
			rev = rev+orginal.charAt(i);
		}
		if(orginal.equals(rev)) {
			System.out.println("The given string is Palindrome" );
		} else 
			System.out.println("The given string is not a plaindrome");
	}
}
