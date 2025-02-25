package Feb_25_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1. normal alert
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Alert myalert=driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//2. confirmation alert
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();//closing alert using ok button
//		driver.switchTo().alert().dismiss();//closing alert using cancel button
		
		
		//3. prompt alert
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		
		
		
		

	}

}
