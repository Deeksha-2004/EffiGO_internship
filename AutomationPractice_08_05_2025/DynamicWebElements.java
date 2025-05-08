package AutomationPractice_08_05_2025;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");

		//GO TO ELEMENTS SECTION
	    WebElement elebtn = driver.findElement(By.xpath("//h5[text()='Elements']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", elebtn);
	    elebtn.click();
	    
	    //CLICK ON DYNAMIC PROPERTIES
	    WebElement dyn=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
	    dyn.click();
	    
	    //VERIFY WHETHER ELEMENT IS ENABLED
	    WebElement d1= wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
	    System.out.println("Is the element clickable:"+d1.isEnabled());
	    
	    
	}

}
