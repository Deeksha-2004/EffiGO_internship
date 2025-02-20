package SeleniumLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		
		//id
//		boolean logoDisplayStatus=dr.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplayStatus);
		
		
		//name
//				dr.findElement(By.name("search")).sendKeys("Mac");
		//linktext and partiallinktext
	dr.findElement(By.linkText("Tablets")).click();
		
	dr.findElement(By.partialLinkText("Tab")).click();
		
//		class name
//		List<WebElement> headerLinks=dr.findElements(By.className("list-inline-item"));
//		System.out.println("total number of header links"+headerLinks.size());
//		
		
//		Tagname
		
		List<WebElement> links=dr.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());

	}

}
