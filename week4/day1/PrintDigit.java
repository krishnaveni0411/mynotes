package week4.day1;

public class PrintDigit {
	// interview question
	public static void main(String[] args) {
		String text="testlaf4410@gmail.com";
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		/*System.out.println();
		String text1="testlaf4410@gmail.com";
		String replaceAll1 = text.replaceAll("[0-9]", text);
		System.out.println(replaceAll1);
		*/
	}

}
