package SeleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.nopcommerce.com/");
		
		dr.manage().window().maximize();
		
		//tag id   tag#id
//		dr.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//dr.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		
		//tag class   tag.classname
		
		//dr.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		
		//tag attribute    tag[attribute="value"]
		//dr.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		
		//tag class attribute
		
		dr.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("t-shirts");
		
	}

}
