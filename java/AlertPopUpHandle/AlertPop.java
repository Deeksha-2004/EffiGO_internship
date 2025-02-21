package AlertPopUpHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input[value=' Login']")).click();
		
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
	
		if(text.equals("Please enter email address")) 
		{
			System.out.println("alert message is corect");
		}
		else 
		{
			System.out.println("Alert message is incorrect");
		}
		
		alert.accept();//for selecting ok

	}

}
