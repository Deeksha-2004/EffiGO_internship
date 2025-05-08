package AutomationPractice_08_05_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/");
		
		//GO TO FRAMES SECTION
		WebElement frame=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",frame);
		frame.click();
		
		//CLICK ON FRAMES
		WebElement frm=driver.findElement(By.xpath("//span[text()='Frames']"));
		frm.click();
		
		//SWITCH TO FARME1
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		
		WebElement msg=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("text inside the frame:"+msg.getText());
		
		driver.switchTo().defaultContent();
		
		//SWITCH TO FRAME2
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		WebElement msg2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("text inside the frame 2:"+msg2.getText());
		driver.switchTo().defaultContent();
		
		
		

	}

}
