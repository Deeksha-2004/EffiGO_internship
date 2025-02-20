package SeleniumLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator_Orange {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(10));
		
		//locators:
		
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
				username.sendKeys("Admin");
				
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
	    dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
