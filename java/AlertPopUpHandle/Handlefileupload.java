package AlertPopUpHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefileupload {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/deeks/OneDrive/Documents/ITS-M11.pdf");

	}

}
