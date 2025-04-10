import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RFQ {
	public static void main(String [] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training1.effigo.in/upeg/");
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
	    driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	    driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("//b[normalize-space()='CREATE RFQ']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='tenderTitle']")).sendKeys("pentaa");
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
	    
	    
//	    driver.findElement(By.xpath("//a[normalize-space()='Save to my space']")).click();
	    
//	    driver.findElement(By.xpath("//input[@id='template_name']")).sendKeys("1334");
//	    driver.findElement(By.xpath("//button[@id='saveToSpace']")).click();
//	    driver.findElement(By.xpath("//button[@onclick=\"checkLength()\"]")).click();
	    //driver.findElement(By.xpath("//input[@id='temp_6']")).click();
	    
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
	    
	    driver.findElement(By.xpath("//input[@id=\"startBidSubmissionDate\"]")).sendKeys("10-04-2025 18:30:00");
	    driver.findElement(By.xpath("//input[@id=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 18:31:00");
	    driver.findElement(By.xpath("//button[@onclick=\"goToSave();\"]")).click();
	    
	    driver.findElement(By.xpath("//textarea[@id=\"comments\"]")).sendKeys("abcd");
	    driver.findElement(By.xpath("//button[@onclick=\"submitTender()\"]")).click();
	    
	    Alert alt=driver.switchTo().alert();
	    alt.accept();
	    
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    
	   // driver.findElement(By.xpath("//span[@class=\"fa fa-home\"]")).click();
	   // driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
	    driver.findElement(By.xpath("//tbody//tr//td[text()='pentaa']/../td[8]/a")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"getAdendumPage1();\"]")).click();
	    driver.findElement(By.xpath("//label[text()='Edit Dates']")).click();
	    driver.findElement(By.xpath("//button[@onclick=\"proceed();\"]")).click();
	  //  driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 17:18:00");
	    driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("ABCD");
	    driver.findElement(By.xpath("//button[text()='Raise Addendum']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    driver.get("https://training1.effigo.in/upeg/");
	    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
	    driver.findElement(By.xpath("(//span[@class=\"title\"])[9]")).click();
	    driver.findElement(By.xpath("//tbody//..//td[text()='pentaa']/../td[5]/a")).click();
	   // WebElement ele=driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]"));
	   // ele.clear();
	    //driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 17:23:00");
	    driver.findElement(By.xpath("//textarea[@id=\"comment\"]")).sendKeys("abcd");

	    
	    driver.findElement(By.xpath("//button[@onclick=\"approveAddendum();\"]")).click();
	    Alert alltt=driver.switchTo().alert();
	   System.out.println("The alert msg : "+ alltt.getText());
	    alltt.accept();
	    
	        driver.get("https://training1.effigo.in/portal/");
	        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
	        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
	        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	        
	        Alert alt1=driver.switchTo().alert();
		    alt1.accept();
		    
	        driver.findElement(By.xpath("//div[text()='NEW']")).click();
	        Thread.sleep(15000);
	        driver.findElement(By.xpath("//tbody//tr//td[text()='pentaa']/../td[4]//a")).click();
	        driver.findElement(By.xpath("//label[@for=\"check0\"]")).click();
	        
	        


	       // driver.findElement(By.xpath("//label[@for='check0']")).click();
	        driver.findElement(By.xpath("//label[@onclick=\"checkedTermsAndCondition();\"]")).click();
	        driver.findElement(By.xpath("//button[@id='payAndAccept']")).click();
	        driver.findElement(By.xpath("//button[@id='proceed']")).click();
	        driver.findElement(By.xpath("//button[text()='Proceed To Price Bid']")).click();
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3000");
	        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("2");
	        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("5000");
	        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("3");
	        driver.findElement(By.xpath("//button[@id='calc_total']")).click();
	        driver.findElement(By.xpath("//button[@id=\"submit_123\"]")).click();
	        driver.findElement(By.xpath("//button[text()='Proceed To Final Bid']")).click();
	        driver.findElement(By.xpath("//input[@id='termsConditions']")).click();
	        driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	        driver.findElement(By.xpath("//button[@id='closeBtn']")).click();
	        //driver.findElement(By.xpath("(//button[text()='Close'])[11]")).click();
	        
	        
	        
	       // driver.get("https://training1.effigo.in/upeg/");
//			driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
//		    driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
//		    driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		    /*driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
		    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
		    driver.findElement(By.xpath("//tbody//tr//td[text()='pentaa']/../td[8]/a")).click();
		    driver.findElement(By.xpath("//button[@onclick=\"getAdendumPage1();\"]")).click();
		    driver.findElement(By.xpath("//label[text()='Edit Dates']")).click();
		    driver.findElement(By.xpath("//button[@onclick=\"proceed();\"]")).click();
		    driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 17:18:00");
		    driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("ABCD");
		    driver.findElement(By.xpath("//button[text()='Raise Addendum']")).click();
		    
		    driver.findElement(By.xpath("//button[text()='Close']")).click();
		    driver.get("https://training1.effigo.in/upeg/");
		    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
		    driver.findElement(By.xpath("(//span[@class=\"title\"])[9]")).click();
		    driver.findElement(By.xpath("//tbody//..//td[text()='pentaa']/../td[5]/a")).click();
		    WebElement ele=driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]"));
		    ele.clear();
		    driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("10-04-2025 17:23:00");
		    driver.findElement(By.xpath("//textarea[@id=\"comment\"]")).sendKeys("abcd");
	
		    
		    driver.findElement(By.xpath("//button[@onclick=\"approveAddendum();\"]")).click();
		    Alert alltt=driver.switchTo().alert();
		   System.out.println("The alert msg : "+ alltt.getText());
		    alltt.accept();*/
		    driver.get("https://training1.effigo.in/upeg/");
		    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
		    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
		    driver.findElement(By.xpath("//a[normalize-space()='Sourcing']")).click();
		    driver.findElement(By.xpath("(//span[@class=\"title\"])[3]")).click();
		    driver.findElement(By.xpath("//tbody//tr//td[text()='pentaa']/../td[8]/a")).click();
		    
		    
		    
		    
		    driver.findElement(By.xpath("//a[@onclick=\"startCommercial('3');\"]")).click();
//		    Alert alltt=driver.switchTo().alert();
//		    alltt.accept();
//		    driver.findElement(By.xpath("(//span[@class='fa fa-thumbs-up'])[2]")).click();
//		    driver.findElement(By.xpath("//textarea[@id=\"priceAcceptComments\"]")).sendKeys("acds");
//		    driver.findElement(By.xpath("//button[@id=\"priceAcceptBtn\"]")).click();
//		    Alert allttt=driver.switchTo().alert();
//		    allttt.accept();
//		    driver.findElement(By.xpath("//a[@onclick=\"stopCommercial('4');\"]")).click();
//		    Alert alllttt=driver.switchTo().alert();
//		    alllttt.accept();
//		    driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
		    
		    
		    
		    
		    
		    
	        
	        
	        
	}
	    

	    
	    
	    
	    
	    
	    
	    
	}


