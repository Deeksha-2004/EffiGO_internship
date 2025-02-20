package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingBrowser {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		
		dr.get("http:google.com");
		
		String title=dr.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		System.out.println(dr.getCurrentUrl());
		
		System.out.println(dr.getPageSource());
		
		dr.quit();

	}

}
