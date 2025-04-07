import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class usercreation {

		    public static void main(String[] args) {

		    	WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();

		        

		        driver.get("https://training1.effigo.in/admin/");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
		        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
		        driver.findElement(By.xpath("//button[@type='button']")).click();

		        driver.findElement(By.xpath("//h3[normalize-space()='User Creation']")).click();
		        driver.findElement(By.id("adduser")).click();

		        // Department
		        WebElement bu = driver.findElement(By.id("department"));
		        Select bUnit = new Select(bu);
		        bUnit.selectByVisibleText("Construction");

		        // User Info
		        driver.findElement(By.id("userName")).sendKeys("Aarav");

		        WebElement desgn = driver.findElement(By.id("designation"));
		        Select dsgn = new Select(desgn);
		        dsgn.selectByVisibleText("Manager");

		        driver.findElement(By.id("firstName")).sendKeys("Aarav");
		        driver.findElement(By.id("lastName")).sendKeys("Shet");
		        driver.findElement(By.id("mobile")).sendKeys("9988776655");
		        driver.findElement(By.id("email")).sendKeys("aar123@gmail.com");

		        WebElement loc = driver.findElement(By.id("locationId"));
		        Select loca = new Select(loc);
		        loca.selectByVisibleText("kashi");

		        // Role checkboxes
		        driver.findElement(By.xpath("//label[@for='isHod']")).click();
		        driver.findElement(By.xpath("//label[@for='admin']")).click();
		        driver.findElement(By.xpath("//label[@for='categoryApprover']")).click();
		        driver.findElement(By.xpath("//label[@for='buHead']")).click();
		        driver.findElement(By.xpath("//label[@for='report']")).click();
		        driver.findElement(By.xpath("//label[@for='vendorAdmin']")).click();

		        // Category
		        WebElement cat = driver.findElement(By.id("categorysId"));
		        Select catg = new Select(cat);
		        catg.selectByVisibleText("cat-2");
		       
		       

		        // Role checkboxes
		        driver.findElement(By.xpath("//label[@for='catalogCreation']")).click();
		        driver.findElement(By.xpath("//label[@for='catalogApproval']")).click();
		        driver.findElement(By.xpath("//label[@for='catalogexpire']")).click();
		        driver.findElement(By.xpath("//label[@for='requisitionCreation']")).click();
		        driver.findElement(By.xpath("//label[@for='requisitionApproval']")).click();
		        driver.findElement(By.xpath("//label[@for='poCreation']")).click();
		        driver.findElement(By.xpath("//label[@for='poApproval']")).click();
		        
		        
		        driver.findElement(By.xpath("//label[@for='grnCreation']")).click();
		        driver.findElement(By.xpath("//label[@for='grnApproval']")).click();
		        driver.findElement(By.xpath("//label[@for='eventCreate']")).click();
		        driver.findElement(By.xpath("//label[@for='eventEdit']")).click();
		        driver.findElement(By.xpath("//label[@for='eventDelete']")).click();
		        
		        driver.findElement(By.xpath("//label[@for='tendercreator']")).click();
		        
		        driver.findElement(By.xpath("//button[@id='createClientUserBtn']")).click();
		        
		        
		        
		       driver.get("https://training1.effigo.in/admin/#no-back");
		        
		       driver.findElement(By.xpath("//h3[normalize-space()='Change User Password']")).click();
		       
		       WebElement change=driver.findElement(By.xpath("//select[@id='roleId']"));
		       Select changed=new Select(change);
		       changed.selectByVisibleText("Clients");
		       
		       driver.findElement(By.xpath("//input[@placeholder='Enter UserName']")).sendKeys("Aarav");
		       driver.findElement(By.xpath("//input[@type='submit']")).click();
		       
		       driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("aaaa");
		       driver.findElement(By.xpath("//input[@value='Submit']")).click();
		       
		       
		       
		       driver.get("https://training1.effigo.in/upeg/");
		       driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
		       driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("aaaa");
		       driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		       
		       
		       
		       
		       driver.findElement(By.xpath("//input[@placeholder='Old Password']")).sendKeys("aaaa");
		       driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("Bob@1234");
		       driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Bob@1234");
		       driver.findElement(By.xpath("//input[@value='Submit']")).click();
		         		       
		       driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Aarav");
		       driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
		       driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		       
		        // Optional: Submit button (add if needed)
		        // driver.findElement(By.id("submitBtn")).click(); // or correct ID

		        // Optional: Close browser
		        // driver.quit();
		    }
		}





