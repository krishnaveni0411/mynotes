package week5.day1;

public class AutoIn extends VehicleIn {
	public void driveAuto() {
		System.out.println("Drive Auto");
	
	}
	public static void main(String[] args) {
		AutoIn auto=new AutoIn();
		auto.applyBreak();
		auto.driveAuto();
	}
}
