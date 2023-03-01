package week2.day3;

public class FindIntersection {
	public static void main(String[] args) {
		// Declare two arrays
		int[] num1= {1,2,3,4,5,6,7,8,2};
		int[] num2= {3,12,34,5,6,7,11,9};
		// output : 3,5,6,7
		
		// for loop for tow arrays
		// Iterate the values of 0 to num1.length
		for(int i=0; i<num1.length; i++) {
			// Iterate the values of 0 to num2.length
            for(int j=0; j<num2.length; j++) {
            	//checking the condition num1[i]==num2[j], for getting common values 
            	//or 
            	//compare the values if both arrays are match
				if (num1[i]==num2[j]) {
					// print the common values in both the arrays
				System.out.println(num1[i]);	
				}
			}	
		}
			
		
		
	}

}
