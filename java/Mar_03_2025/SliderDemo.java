package Mar_03_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println("Default loaction of the min slider before moving:"+min_slider.getLocation());//(59,249)
		
		act.dragAndDropBy(min_slider, 100, 194).perform();
		System.out.println("Location of the min_slider after moving:"+min_slider.getLocation());//(158,249)
		
		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Default loaction of the max slider before moving:"+max_slider.getLocation());//(59,249)
		
		act.dragAndDropBy(max_slider,-76, 196).perform();
		System.out.println("Location of the max_slider after moving:"+max_slider.getLocation());//(158,249)
		

	}

}
