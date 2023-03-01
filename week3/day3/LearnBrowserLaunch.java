package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowserLaunch {
	public static void main(String[] args) {
		// Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		// Open the url or Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//  To maximize the screen
		driver.manage().window().maximize();
		// Enter the uername as Demosalesmanager
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
// Enter the password as crmsfa
driver.findElement(By.id("password")).sendKeys("crmsfa");
// click the login button
driver.findElement(By.className("decorativeSubmit")).click();
//check or validate the welcome page.
String text=driver.findElement(By.tagName("h2")).getText();
// print the content in the h2 tag 
System.out.println(text);
//click on crmsfa hyper link
driver.findElement(By.linkText("CRM/SFA")).click();
//click on lead tap
driver.findElement(By.linkText("Leads")).click();
//click on create lead
driver.findElement(By.partialLinkText("Create")).click();
// selenium will take the first match 

	}

}
