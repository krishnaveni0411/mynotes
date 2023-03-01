package week3.day1;

public class LearnSplit {
	public static void main(String[] args) {
		String name="Amazom development center has 25,543 employees in chennai";
		String[] split = name.split(" ");
		int count=0;
		System.out.println(split.length);
		for(int i=0; i< split.length; i++) {
			count++;
			System.out.println(split[i]);
		}
		System.out.println(count);
	}

}
