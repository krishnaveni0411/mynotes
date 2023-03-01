package week1.day2;

public class Mobile {
public void sendMessage()
{
	System.out.println("Send Message");
}
public void makeACall()
{
	System.out.println("Make A Call");
}
public void shareDocument()
{
	System.out.println("Share A Document");
}
public void openAnApplication()
{
	System.out.println("Open An Application");
}
public void opensetting()
{
	System.out.println("Open Settings");
}
public void turnOnMoblieNetwork()
{
	System.out.println("Turn On the Mobile Network");
}
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.sendMessage();
	mob.makeACall();
	mob.shareDocument();
	mob.openAnApplication();
	mob.opensetting();
	mob.turnOnMoblieNetwork();
}
}
