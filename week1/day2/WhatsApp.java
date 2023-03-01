package week1.day2;

public class WhatsApp {
public void sendMessage()
{
	System.out.println("Send Messages");
}
public void makeAVoiceCall()     
{
	System.out.println("Make A Voice Call");
}
public void makeAVideoCall()
{
	System.out.println("Make A Video Call");
}
public void statusUpdate()
{
	System.out.println("Status Update");
}
public void sendMessagesToGroup()
{
	System.out.println("Send A Message To The Group");
}
public void sendVoiceMessage()
{
	System.out.println("Send A Voice Messages");
}
public void sendGifMessages()
{
	System.out.println("Send A GIF Messages");
}
public void sendPicMessages()
{
	System.out.println("Send A Pic Messages");
}
public void sendVideoMessages()
{
	System.out.println("Send A Video Messages");
}
public static void main(String[] args) {
	WhatsApp app=new WhatsApp();
	app.sendMessage();
	app.makeAVideoCall();
	app.makeAVoiceCall();
	app.statusUpdate();
	app.sendGifMessages();
	app.sendMessagesToGroup();
	app.sendPicMessages();
	app.sendVideoMessages();
	app.sendVoiceMessage();
}
}
