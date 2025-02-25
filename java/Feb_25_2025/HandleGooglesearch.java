package Feb_25_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGooglesearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='option']"));
		
		System.out.println("total number of sugestions in the serach box::"+list.size());

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing in software engineering")) {
				
				list.get(i).click();
				break;
			
			
			
			
			}
		}	

	}
}





//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']