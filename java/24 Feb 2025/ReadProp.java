package AlertPopUpHandle;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Selenium\\seleniumDriver\\src\\test\\java\\AlertPopUpHandle\\config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("URL");
		
		System.out.println(url);
		
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		
		if (browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("it is not matching");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.findElement(By.xpath(prop.getProperty("Username_xapth"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("password_xapth"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginbtn_xpath"))).click();
		


	}

}

