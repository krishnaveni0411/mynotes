package week5.day1;

public class AndroidMobileIn extends MobileIn {
	
public void takePhoto() {
	System.out.println("Take a Photo");
}
public void videoCall() {
	System.out.println("Video Call");
}
public static void main(String[] args) {
	AndroidMobileIn mobile=new AndroidMobileIn();
	mobile.makeCall();
	mobile.sendMessage();
	mobile.takePhoto();
	mobile.videoCall();
}
}
