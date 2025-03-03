package Mar_03_2025;
import java.util.List;
import java.time.Duration;
import java.util.ArrayList; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		//control+regLink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		//switching to registration page
		
		List<String> ids=new ArrayList(driver.getWindowHandles());
		//Registration page
		driver.switchTo().window(ids.get(1));//switch to regsitration page
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENDY");
		//home page
		
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
		
		
		

	}

}
