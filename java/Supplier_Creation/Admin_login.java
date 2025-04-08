package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Admin_login {
	
	@Test
	public void Admin_login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://training1.effigo.in/admin/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//button[@type='button']")).click();

        
		
	}

}
