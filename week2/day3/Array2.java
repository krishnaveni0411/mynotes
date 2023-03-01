package week2.day3;

public class Array2 {
public static void main(String[] args) {
	// Creating an array with new keyword
	String[] v=new String[5];
	v[0]="krishna";
	v[1]="akash";
	v[2]="sri priya";
v[3]="divya";
	v[4]="kumar";
	// for printing a single array index 
	System.out.println(v[4]+"\n");
	// for printing all the array values 
	for (int i = 0; i < v.length; i++) {
		System.out.println(v[i]);
	}
}
}
