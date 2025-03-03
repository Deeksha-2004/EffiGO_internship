package Mar_03_2025;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CaptureScreenShots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. full page screenshot
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png"); 
		sourceFile.renameTo(targetFile);*/
		
		//2.capture the screenshot of specific section
		
		/*WebElement featuredproduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourceFile=featuredproduct.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\featured.png");
		sourceFile.renameTo(targetFile);*/
		
		//3. capture the screenshot of webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile=logo.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourceFile.renameTo(targetFile);

	}

}
