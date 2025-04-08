package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Change_password {
	
	@Test
	public void change_Password()
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://training1.effigo.in/admin/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
	        driver.findElement(By.xpath("//button[@type='button']")).click();
	        driver.findElement(By.xpath("//h3[normalize-space()='Change User Password']")).click();
	        WebElement role=driver.findElement(By.xpath("//select[@id='roleId']"));
	        Select rl=new Select(role);
	        rl.selectByVisibleText("Suppliers");
	        driver.findElement(By.xpath("//input[@placeholder='Enter UserName']")).sendKeys("deeya@gmail.com");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("dddde");
	        driver.findElement(By.xpath("//input[@type='button']")).click();

		
	}

}
