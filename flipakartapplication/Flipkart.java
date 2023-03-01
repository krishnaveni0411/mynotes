package flipakartapplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("9874125630");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("moblie");
	 driver.findElement(By.className("L0Z3Pu")).click();
	 String url = "https://www.flipkart.com/redmi-10-caribbean-green-64-gb/";
	 driver.findElement(By.xpath("//div[@class='gUuXy-']")).click();
	 
	 //driver.findElement(By.linkText("Add to cart")).click();+++++
	String currentUrl = driver.getCurrentUrl();
	 driver.findElement(By.xpath("//span[text()='Cart']")).click();
	 //String title2 = driver.getTitle();
	String text = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
	System.out.println(text);
		if(currentUrl.equals(contains(url))) {
			System.out.println("Product is added to the cart");
		} else
		{ System.out.println("Product is not added to the cart"); }
		
		
			driver.close();
	}

	private static Object contains(String url) {
		// TODO Auto-generated method stub
		return null;
	}
}
