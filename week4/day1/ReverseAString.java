package week4.day1;

import java.util.Scanner;

public class ReverseAString {
public static void main(String[] args) {
	// reverse string with scanner, reverse string is an interview question
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your input");
			String val=scan.nextLine();
			char[] reverse=val.toCharArray();
			for(int i=reverse.length-1; i>=0; i--) {
				System.out.println(reverse[i]);
			}
			
			// reverse the string not changing to toCharArray and without scanner 
			String orginal = "input";
			String rev ="";
			for(int i= orginal.length()-1; i>=0; i--)
			{
				rev = rev+orginal.charAt(i);
			}
			System.out.println(rev);
			
			// reverse the string using toCharArray and without Scanner 
			String org = "value";
			String reve ="";
			char[] charArray=org.toCharArray();
			for(int i= charArray.length-1; i>=0; i--)
			{
				reve = reve+charArray[i];
			}
			System.out.println(reve);
}
}
