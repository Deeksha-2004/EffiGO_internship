package AlertPopUpHandle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class TakeScreenShot {

	public static void main(String[] args)throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://google.com");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:/Selenium/seleniumDriver/src/test/java/AlertPopUpHandle/google.png"));
		
	

	}

}
