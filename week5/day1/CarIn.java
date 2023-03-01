package week5.day1;

public class CarIn extends VehicleIn{
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public static void main(String[] args) {
		CarIn car=new CarIn();
		car.applyBreak();
		car.applyGear();
	}
}
