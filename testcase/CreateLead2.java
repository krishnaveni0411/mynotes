package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead2 extends BeforeClass {
@Test
	public  void runCreateLead() {
		
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






