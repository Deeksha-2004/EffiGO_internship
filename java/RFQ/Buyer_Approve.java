package RFQ;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buyer_Approve {
	WebDriver driver=new ChromeDriver();
	@Test
	public void buyer_approve() throws InterruptedException
	{
		driver.get("https://training1.effigo.in/upeg/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
	    driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	    driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
	    //driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    //driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//tbody//tr//td[text()='Lap']/../td[8]/a")).click();
	    
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick=\"startCommercial('3');\"]")));
//	    element.click();
	    
	    driver.findElement(By.xpath("//a[@onclick=\"startCommercial('3');\"]")).click();
	    Alert alt=driver.switchTo().alert();
	    alt.accept();
	    driver.findElement(By.xpath("(//span[@class=\"fa fa-thumbs-up\"])[2]")).click();
	    driver.findElement(By.xpath("//textarea[@id=\"priceAcceptComments\"]")).sendKeys("ABCD");
	    driver.findElement(By.xpath("//button[@id=\"priceAcceptBtn\"]")).click();
	    alt.accept();
	    driver.findElement(By.xpath("//button[@onclick=\"getAllRoundsPriceComparision();\"]")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"exportToExcel();\"]")).click();
	    driver.findElement(By.xpath("//button[@id=\"closeBtn\"]")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"newPriceComparison();\"]")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"exportToExcel();\"]")).click();
	    driver.findElement(By.xpath("//button[@id=\"closeBtn\"]")).click();
	    driver.findElement(By.xpath("//a[@onclick=\"stopCommercial('4');\"]")).click();
	    alt.accept();
	    driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();

		
	}

}
