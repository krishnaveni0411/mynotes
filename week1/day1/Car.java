package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("Drive Car");
	
	}
	public void applyBreak() {
		System.out.println("apply Break");
	}
	public void soundHorn() {
		System.out.println("sound Horn");
	}
	public static void main(String[] args) {
		Car C=new Car();
		C.driveCar();
		C.applyBreak();
		C.soundHorn();
	}
}
