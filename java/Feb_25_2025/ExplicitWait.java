package Feb_25_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		username.sendKeys("Admin");
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("admin123");
		
		WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();
		
		
		
	

	}

}
