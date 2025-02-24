package AlertPopUpHandle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavScriptExecuter1 {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement lgnbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		flash(lgnbtn,driver);
		drawBorder(lgnbtn,driver);
		
		
		//to take the screenshot
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:/Selenium/seleniumDriver/src/test/java/AlertPopUpHandle/element.png"));
		
		
		
		//genearting alerts
//		generateAlert(driver,"There is an issues in the login button");
		
		
		clickElementByJS(lgnbtn,driver);
		
		
		// 1. refresh the page
		driver.navigate().refresh();
		
		// 2. by using JS
		refreshBrowserByJS(driver);
		
		
		
		
		//get the title of the page
		
		System.out.println(getTitleByJS(driver));
		 Thread.sleep(3000);
		
		//get the page text
		System.out.println(getPageInnerText(driver));
		
		
//		scrollPageDown(driver);
		
		
		// scroll to get the specified element
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		scrollIntoView(ele,driver);

	}
	
	
	//change the background color of the login button
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			
		}
}
	
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try {
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	
//	Drawing the border for the login button
	
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	
	//generating alert messages
	public static void generateAlert(ChromeDriver driver,String message)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	
	
	//clicking the element using JS
	public static void clickElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
		
	}
	
	//refreshing the browser using JS
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	
	// getting the title of the page
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
		
	}
	
	
	//getting the inner text of the page
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
		
	}
	
	//scrolling to the bottom of the page
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//scrolling to get the sepcific element
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}
	
	
	
	
	
	

	}


