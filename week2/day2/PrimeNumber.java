package week2.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		// Declare input 
		int i=13;
		//initialize the count variable
		int count =0;
		//Iterate the values 1 to i
		for (int j = 1; j <=i; j++) {
			//if the number is divisible by 1 and itself
			// %-modules , modules is the reminder  
			if(i%j==0) {
				//increase the count variable
				count++;
				// count=count+1;
			}
			
		}
		if(count==2) {
			System.out.println("The given number is prime number ");
		}
	}

}
