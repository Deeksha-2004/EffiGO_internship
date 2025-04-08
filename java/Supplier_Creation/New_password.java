package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_password {
	
	@Test
	public void New_Password()
	{
		WebDriver driver=new ChromeDriver();
		   driver.get("https://training1.effigo.in/portal/");
		   driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
	        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("dddde");
	        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	        driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("dddde");
	        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Bob@1234");
	        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Bob@1234");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
