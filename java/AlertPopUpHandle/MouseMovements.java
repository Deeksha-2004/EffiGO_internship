package AlertPopUpHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Add-ons')]"))).build().perform();
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Visa Services")).click();
		
		
	}

}
