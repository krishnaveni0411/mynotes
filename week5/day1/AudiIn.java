package week5.day1;

public class AudiIn extends CarIn {
	public void soundHorn() {
		System.out.println("sound Horn");
	}
	public static void main(String[] args) {
		AudiIn audi=new AudiIn();
		audi.applyBreak();
		audi.applyGear();
		audi.soundHorn();
	}
}
