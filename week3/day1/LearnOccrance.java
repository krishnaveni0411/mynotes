package week3.day1;

public class LearnOccrance {
	/* Pseudocode:
	 declare a string variable as input="Hexaware"
	 change the string into char array
declare a variable as count and initial it to 0
	 for loop initials integer i to 0, then the condition is char array length , then increment the variable.
	for(int i=0; i<chararray.length; i++)
	 check the condition if it match then increase the count
	print the count.
	*/
	// to get the size of the string we use stringname.length(), it returns integer value
	// only string can be used dot.equal method & double equal
	// split & replace all method  is in string.
	// array
	//Arrays.equal is used to check the array & Arrays.sort is used to sort the array in ascending order
	
public static void main(String[] args) {
	
	// declare a string variable as input="Hexaware"
	String input = "Hexaware";
	// change the string into char array
	char[] charArray=input.toCharArray();
	// declare a variable as count and initial it to 0
	int count =0;
	// Iterate the characters
	for (int i=0; i<charArray.length; i++)
	{
		//check the condition if it match
		if(charArray[i]=='e') 
			//increase the count
			count++;
		 
	}
	//print the count.
	System.out.println(count);
}
}
