package week2.day2;

public class Factorial {
public static void main(String[] args) {
	// initialize the fact variable value is 1
	int fact=1;
	//declare the input
	int input=5;
	//for(int i=5; i>0;i--)
	//for(int i=5; i>=1; i--)
	for (int i = input; i>1; i--) {
		fact=fact*i;
		//System.out.println(fact);
		// if we have given the syso inside the for loop means we will have all the iterate values are printed.
	}
	System.out.println(fact);
}
}
