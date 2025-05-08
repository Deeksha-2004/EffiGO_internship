package AutomationPractice_08_05_2025;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/");

		//GO TO WIDGETS SECTION
	    WebElement widbtn = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", widbtn);
	    widbtn.click();
	    
	    //CLICK ON SELECT MENU
	    WebElement menu = driver.findElement(By.xpath("//span[text()='Select Menu']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menu);
	    menu.click();
	    
	    //SELECT IN Select Value
	    WebElement selectValueDropdown = driver.findElement(By.xpath("//div[@id='withOptGroup']//div[@class=' css-1wa3eu0-placeholder']"));
        selectValueDropdown.click();
        WebElement selectValueOption = driver.findElement(By.xpath("//div[text()='Group 1, option 2']"));
        selectValueOption.click();
        
        //SELECT IN Select One
	    WebElement selectOneDropdown = driver.findElement(By.xpath("//div[@id='selectOne']//div[@class=' css-1wa3eu0-placeholder']"));
        selectOneDropdown.click();
        WebElement selectOneOption = driver.findElement(By.xpath("//div[text()='Mrs.']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectOneOption);
        
        //SELECT IN Old Style Select Menu
        WebElement oldselect=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select select=new Select(oldselect);
        select.selectByVisibleText("Black");
        
        
        //SELECT IN Standard multi select
        WebElement multiselect=driver.findElement(By.xpath("//select[@id='cars']"));
        Select select1=new Select(multiselect);
        select1.selectByVisibleText("Volvo");
        select1.selectByVisibleText("Audi");
        
        
        System.out.println("Dropdown selections completed successfully.");
        
        
      

        	
	}

}
