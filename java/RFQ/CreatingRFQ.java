package RFQ;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatingRFQ {
	WebDriver driver=new ChromeDriver();
	@Test
	public void creating_RFQ() throws InterruptedException
	{
		driver.get("https://training1.effigo.in/upeg/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
	    driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	    driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		
	    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("//b[normalize-space()='CREATE RFQ']")).click();
	    driver.findElement(By.xpath("//input[@id='tenderTitle']")).sendKeys("Lap");
	    WebElement curr=driver.findElement(By.xpath("//select[@id='tenderCurrency']"));
	    Select currency=new Select(curr);
	    currency.selectByVisibleText("INR");
	    
	    
	    
	    WebElement dept=driver.findElement(By.xpath("//select[@id='departmentId']"));
	    Select bu=new Select(dept);
	    bu.selectByVisibleText("Electronics");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Proceed to Add Work Item']")).click();
	    
	    driver.findElement(By.xpath("//span[@id='commtype']")).click();
	    driver.findElement(By.xpath("//input[@id='estimateValue']")).sendKeys("10000");
	    driver.findElement(By.xpath("//button[@id='addItems']")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder=\"Please enter item code\"]")).sendKeys("%");
	   // Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id=\"itemsSearch\"]")).click();
	    driver.findElement(By.xpath("//input[@id='IT-c61372-06-02-2025-17']")).click();
	    driver.findElement(By.xpath("//input[@id='IT-0497af-10-02-2025-04']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	    driver.findElement(By.xpath("//b[normalize-space()='Close']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='subItemQuantity_1']")).sendKeys("10");
	    WebElement Unit=driver.findElement(By.xpath("//select[@id='subItemUnit_1']"));
	    Select UOM=new Select(Unit);
	    UOM.selectByVisibleText("NOs");
	    driver.findElement(By.xpath("//textarea[@id='descriptions_1']")).sendKeys("Item number 1");
	    
	    
	    driver.findElement(By.xpath("//input[@id='subItemQuantity_2']")).sendKeys("20");
	    WebElement Unit1=driver.findElement(By.xpath("//select[@id='subItemUnit_1']"));
	    Select UOM1=new Select(Unit1);
	    UOM1.selectByVisibleText("NOs");
	    driver.findElement(By.xpath("//textarea[@id='descriptions_2']")).sendKeys("Item number 2");
	   /* Alert al=driver.switchTo().alert();
	    al.accept();*/
	    driver.findElement(By.xpath("//button[@onclick=\"goToFee();\"]")).click();
	    
	    
	    driver.findElement(By.xpath("//a[@onclick=\"getTemplateModal('1');\"]")).click();
	    Alert al=driver.switchTo().alert();
	    al.accept();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[2]")).click();
	    driver.findElement(By.xpath("//button[@id='price_template_save']")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"checkLength()\"]")).click();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Search Suppliers']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='searchString']")).sendKeys("deeya");
	    driver.findElement(By.xpath("//button[@onclick=\"searchSupplierNew()\"]")).click();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Add All']")).click();
	    driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Add']")).click();
	    driver.findElement(By.xpath("//input[@onclick=\"return getDates();\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"startBidSubmissionDate\"]")).sendKeys("11-04-2025 15:18:00");
	    driver.findElement(By.xpath("//input[@id=\"endBidSubmissionDate\"]")).sendKeys("11-04-2025 15:19:00");
	    driver.findElement(By.xpath("//button[@onclick=\"goToSave();\"]")).click();
	    
	    driver.findElement(By.xpath("//textarea[@id=\"comments\"]")).sendKeys("abcd");
	    driver.findElement(By.xpath("//button[@onclick=\"submitTender()\"]")).click();
	    
	    Alert alt=driver.switchTo().alert();
	    alt.accept();
	    
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    
	   // driver.findElement(By.xpath("//span[@class=\"fa fa-home\"]")).click();
	   // driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
	    driver.findElement(By.xpath("//tbody//tr//td[text()='Lap']/../td[8]/a")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"getAdendumPage1();\"]")).click();
	    driver.findElement(By.xpath("//label[text()='Edit Dates']")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"proceed();\"]")).click();
	  //  driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 17:18:00");
	    driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("ABCD");
	    driver.findElement(By.xpath("//button[text()='Raise Addendum']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    
	    Thread.sleep(3000);
	    driver.get("https://training1.effigo.in/upeg/");
	    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("(//span[@class=\"title\"])[9]")).click();
	    driver.findElement(By.xpath("//tbody//..//td[text()='Lap']/../td[5]/a")).click();
driver.findElement(By.xpath("//textarea[@id=\"comment\"]")).sendKeys("abcd");

	    
	    driver.findElement(By.xpath("//button[@onclick=\"approveAddendum();\"]")).click();
	}

}
