package week3.day1;

public class LearnReplaceAll {
	public static void main(String[] args) {
		String text = "Amazom development center has 25,543 employees in chennai";
		char[] charArray=text.toCharArray();
		String replaceAll=text.replaceAll(text, "");
		for(int i=0; i<charArray.length;i++) {
			if(charArray[i]>=48 &&charArray[i]<=57) {
			
			System.out.println(replaceAll);
			}
			
		}
		
	}

}
