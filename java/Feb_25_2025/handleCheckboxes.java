package Feb_25_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. Selecting specific checkbox
		
		
//		driver.findElement(By.xpath("input//[@id='sunday']")).click();
		
		
//		2. Slecting all checkboxes
		
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		
		
		// 3. Selecting last 3 checkboxes
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 4. Seleecting first 3 checkboxes
		
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
			
		}*/
		
		//5. unselect the checkboxes if they are selected
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		
		
		

	}

}
