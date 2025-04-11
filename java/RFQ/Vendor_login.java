package RFQ;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vendor_login {
	WebDriver driver=new ChromeDriver();
	@Test
	public void vendor_login() throws InterruptedException
	{
		driver.get("https://training1.effigo.in/portal/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
        
        Alert alt1=driver.switchTo().alert();
	    alt1.accept();
	    
        driver.findElement(By.xpath("//div[text()='NEW']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//tbody//tr//td[text()='Lap']/../td[4]//a")).click();
        driver.findElement(By.xpath("//label[@for=\"check0\"]")).click();
        
        


       // driver.findElement(By.xpath("//label[@for='check0']")).click();
        driver.findElement(By.xpath("//label[@onclick=\"checkedTermsAndCondition();\"]")).click();
        driver.findElement(By.xpath("//button[@id='payAndAccept']")).click();
        driver.findElement(By.xpath("//button[@id='proceed']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed To Price Bid']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3000");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("2");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("5000");
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("3");
        driver.findElement(By.xpath("//button[@id='calc_total']")).click();
        driver.findElement(By.xpath("//button[@id=\"submit_123\"]")).click();
        driver.findElement(By.xpath("//button[text()='Proceed To Final Bid']")).click();
        driver.findElement(By.xpath("//input[@id='termsConditions']")).click();
        driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.findElement(By.xpath("//button[@id='closeBtn']")).click();
       
	   
		
	}

}
