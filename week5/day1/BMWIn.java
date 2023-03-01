package week5.day1;

public class BMWIn extends CarIn  {
	public void switchOnAc() {
		System.out.println("Switch On Ac");
	}
	public static void main(String[] args) {
		BMWIn bmw=new BMWIn();
		bmw.applyBreak();
		bmw.applyGear();
		bmw.switchOnAc();
	}
}
