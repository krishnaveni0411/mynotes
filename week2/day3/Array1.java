package week2.day3;

public class Array1 {
	public static void main(String[] args) {
		// Declare an array
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		//to find the size of an array
		int lengthofa=a.length;
		//iterate the value form o to array length
		for(int i=0; i<lengthofa; i++) {
			System.out.println(a[i]);
		}
		System.out.println("\nReverse for loop \n");
		//reverse for loop
		for(int j=lengthofa-1; j>=0;j--) {
			System.out.println(a[j]);
		}
	}

}
