package Feb_27_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpcountry=new Select(drp);
		
		//Select option from the dropdown
		
//		drpcountry.selectByVisibleText("France");
		
//		drpcountry.selectByValue("japan");
		
//		drpcountry.selectByIndex(2);
		
		//capture the options from the dropdown
		
		List<WebElement> options=drpcountry.getOptions();
		System.out.println("number of options in the drop down:"+options.size());
		
		//printing the options
		
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//			
//		}
		
		//enhanced for loop
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		

	}

}
