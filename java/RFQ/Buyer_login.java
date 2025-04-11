package RFQ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buyer_login {
	WebDriver driver=new ChromeDriver();
	@Test
	
	public void login()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training1.effigo.in/upeg/");
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
	    driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	    driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	    
	}
	   
	    

}
