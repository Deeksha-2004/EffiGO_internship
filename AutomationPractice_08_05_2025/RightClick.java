package AutomationPractice_08_05_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {
	
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/");

		
		//GO TO THE ELEMENTS SECTION
	    WebElement elebtn = driver.findElement(By.xpath("//h5[text()='Elements']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", elebtn);   
	    elebtn.click();
	    
	    //CLICK ON BUTTONS
	    WebElement btn=driver.findElement(By.xpath("//span[text()='Buttons']"));
	    btn.click();
	    
	    //RIGHT-CLICK OPERATION
	    WebElement rgtbtn=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	    Actions action=new Actions(driver);
	    action.contextClick(rgtbtn).perform();
	    
	    //VERIFY WHETHER THE OPERATION IS SUCCUSSFULL
	    WebElement msg=driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	    if(msg.getText().equals("You have done a right click")) {
	    	System.out.print("You have perfomed the right click operation correctly");
	    	
	    }
	    else {
	    	System.out.println("Operation is not performed");
	    }
	   
	    
		
	}

}
