package week2.day4;

public class ToPrintEachCharacterInTheGivenStringInReverse {
public static void main(String[] args) {
	//Declare a variable name with the String data type
		String name="krishnaveni";
		//output should be in : k,r,i,s,h,n,a,v,e,n,i
		//To find the size of the string
		int a= name.length();
		// syso the string size
		System.out.println("The size of the string : "+a);
		//convert the string into  the characters
		char[] charArray= name.toCharArray();
		// iterate the value from length of the array to 0
		for(int i=charArray.length-1; i>=0; i--) {
			//print the charArray
			System.out.println(charArray[i]);
		}
		
		}
				
		}
	


