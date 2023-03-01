package week2.day3;
// import is a package name 
// awt shouldn't by imported 
import java.util.Arrays;

public class ToFindSecondLargestNumber {
	public static void main(String[] args) {
		// Declare an array
		int[] num= {40,50,60,70,80,10,20,30};
		// sort the array
		Arrays.sort(num);
		// output: 10,20,30,40,50,60,70,80
		// to get the array length
				int a=num.length;
				//print the second largest number
				System.out.println(" Second Largest Number : "+num[a-2]);
		}

}
