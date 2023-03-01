package week3.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name("firstname")).sendKeys("Veni");
		try {
			driver.findElement(By.name("firstname")).sendKeys("veni");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
		driver.findElement(By.name("lastname")).sendKeys("k");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(ele));
	
		
			//e.printStackTrace();
		
		WebElement element = driver.findElement(By.id("month"));
			WebElement element2 = driver.findElement(By.id("day"));
			WebElement element3 = driver.findElement(By.id("year"));
			Select selectMonth = new Select(element);
			selectMonth.selectByValue("11");
			Select selectDate=new Select(element2);
			selectDate.selectByIndex(3);
			Select selectYear = new Select(element3);
			selectYear.selectByVisibleText("2000");
			driver.close();
			
		}
		
	}


