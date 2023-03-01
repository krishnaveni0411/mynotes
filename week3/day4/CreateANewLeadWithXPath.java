package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateANewLeadWithXPath {
public static void main(String[] args) {
	ChromeDriver browser=new ChromeDriver();
	browser.manage().window().maximize();
	browser.get("http://leaftaps.com/opentaps/control/main");
	browser.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	browser.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	browser.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	browser.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	browser.findElement(By.xpath("//a[text()='Leads']")).click();
	browser.findElement(By.xpath("//a[text()='Create Lead']")).click();
	//browser.findElement(By.linkText("Create Lead")).click();
	browser.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
	browser.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Akash");
	browser.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
	browser.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Akash");
	browser.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("K");
	browser.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Mr.");
	browser.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Lead");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Software Tester");
	browser.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("12,00,000");
	browser.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("8");
	browser.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("5634");
	browser.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("alpi");
	browser.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("Create a new Lead");
	browser.findElement(By.xpath("//input[@id='createLeadForm_importantNote']")).sendKeys("Nothing");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("+44");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("527");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("8547692138");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("45");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("Ram");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("akash421@gmail.com");
	browser.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("https://akash.com/");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Akash");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("Ram");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Plot No D-13");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("Anna Street");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Chennai");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("600057");
	browser.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("3");
	//browser.findElement(By.xpath("//input[@name='smallSubmit']")).click();
	
}
}
