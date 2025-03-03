package Mar_03_2025;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		/*
		 1.Link href="https://xyz.com"
		 2.https://xyz.com ----> server --->status code
		 3.status code>=400 broken link
		 status code<400 not a broken link
		 */
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http:www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("total number of links:"+links.size());
		
		
		int noOfbrokenLinks=0;
		for(WebElement linkElement:links)
		{
			String hrefValue=linkElement.getAttribute("href");
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("href attribute is null or empty");
				continue;
			}
		
		
		//hit url to server
		try {
		URL linkUrl=new URL(hrefValue);// converted href value from string to URL format
				HttpURLConnection connlinkURL=(HttpURLConnection)linkUrl.openConnection(); // open connection  to the server
				connlinkURL.connect();
				if(connlinkURL.getResponseCode()>=400)
				{
					System.out.println(hrefValue+"=======>Broken link");
					noOfbrokenLinks++;
				}
				else
				{
					System.out.println(hrefValue+"======>Not a broken link");
				}
		}catch(Exception e)
		{
			
		}
		
		


	}
		System.out.println("Number of broken links:"+noOfbrokenLinks);
	}

}
