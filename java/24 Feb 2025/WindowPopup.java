package AlertPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		
		driver.findElement(By.xpath("//input[@name='PushButton']")).click();
		
		Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id:"+parentWindowId);
		
		String childWindowId=it.next();
		
		
		System.out.println("child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
		System.out.println("child window popup tutle:"+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title:"+driver.getTitle());

	}

}
