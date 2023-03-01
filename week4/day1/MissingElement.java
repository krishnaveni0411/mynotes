package week4.day1;

import java.util.Arrays;

public class MissingElement {
	// interview questions 
public static void main(String[] args) {
	int[] num= {1,4,3,2,5,7};
	Arrays.sort(num);
	int n=num.length+1;
	int sum = n*(n+1)/2;
	for(int i=0; i<num.length; i++) {
		sum=sum-num[i];
	}
	System.out.println(sum);
}
}
