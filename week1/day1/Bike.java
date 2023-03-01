package week1.day1;

public class Bike {
public void driveBike() {
	System.out.println("Drive Bike");
}
public void applyBreak() {
	System.out.println("Apply Break");
}
public void applyClutch() {
	System.out.println("Apply Clutch");
}
public void soundHorn() {
	System.out.println("Sound Horn");
}
public static void turnRight() {
	System.out.println("Turn Right");
}
public static void turnLeft() {
	System.out.println("Turn Left");
}
public static void Turn() {
	System.out.println("Turn");
}
public static void main(String[] args) {
	Bike B=new Bike();
	B.driveBike();
	B.applyBreak();
	B.applyClutch();
	B.soundHorn();
	turnRight();
	turnLeft();
	Turn();
}
}
