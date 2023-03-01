package week5.day1;

public class BajajIn extends AutoIn{
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
public static void main(String[] args) {
	BajajIn bajaj=new BajajIn();
	bajaj.driveAuto();
	bajaj.applyBreak();
	bajaj.applyAcclerate();
}
}
