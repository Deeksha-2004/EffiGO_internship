package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Supplier_login {
	
	@Test
	public void supplier_login()
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://training1.effigo.in/portal/");
		 driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
	        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	}

}
