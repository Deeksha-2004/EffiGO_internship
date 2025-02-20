package SeleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.opencart.com/");

		//xpath with single attribute
		
		//dr.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with multiple attributes
		//dr.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with 'and' 'or' operator
		
//		dr.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirt");
//		dr.findElement(By.xpath("//input[@name='search' or @placeholder='abc']")).sendKeys("T-shirt");
		
		//xpath with inner text - text()
		
		//dr.findElement(By.xpath("//*[text()='MacBook']")).click();
		
//		boolean display=dr.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(display);
		
		//xpath with contains
		
		//dr.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		//xpath with starts-with
		//dr.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		 
		//chained xpath
	boolean display=dr.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	System.out.println(display);
		
		
		
	}

}
