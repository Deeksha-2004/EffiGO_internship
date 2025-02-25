package Feb_25_2025;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webTable {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("PIM")).click();
			Thread.sleep(3000);
			
			String before_xpath="//div[@class='oxd-table-body']/div[";
			
			String after_xpath="]/div/div[3]";
			
			for(int i=1;i<10;i++)
			{
				String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
				
				System.out.println(name);
				
				if(name.contains("aniket Ashok")) {
					driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div/div[1]")).click();
				}
				
			
			}
			
		
			
			
			
			


	}
	}


