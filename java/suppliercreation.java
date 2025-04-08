import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class suppliercreation {
	public static void main(String[] args) {

    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        

        driver.get("https://training1.effigo.in/admin/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        
        driver.findElement(By.xpath("//h3[normalize-space()='View All Supplier']")).click();
        driver.findElement(By.xpath("//button[@id='newSupplierRegistration']")).click();
        
        
        driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("Book");
        WebElement country=driver.findElement(By.xpath("//select[@id='companyRegisterCountry']"));
        Select ctry=new Select(country);
        ctry.selectByVisibleText("India");
        driver.findElement(By.xpath("//input[@id='regiNumber']")).sendKeys("120066");
        driver.findElement(By.xpath("//input[@id='panNum']")).sendKeys("QWERT1234K");
        driver.findElement(By.xpath("//button[@type='button']")).click();
      
        driver.findElement(By.xpath("//input[@value='PFASNP']")).click();
        driver.findElement(By.xpath("//textarea[@id='regiAddress']")).sendKeys("Banaglore");
        WebElement regs=driver.findElement(By.xpath("//select[@id='country']"));
        Select regscty=new Select(regs);
        regscty.selectByContainsVisibleText("India");
        WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
        Select st=new Select(state);
        st.selectByVisibleText("Karnataka");
        
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("560076");
        driver.findElement(By.xpath("//input[@id='companyEmail']")).sendKeys("book12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("9988009988");
        driver.findElement(By.xpath("//input[@id='gstNum']")).sendKeys("29ABCDE1234F1Z5");
        driver.findElement(By.xpath("//input[@id='contactPerson']")).sendKeys("Deeya");
        driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8899009900");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deeya12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='loginUser']")).sendKeys("");
        driver.findElement(By.xpath("//label[normalize-space()='Save']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Click']")).click();
        
        driver.findElement(By.xpath("//h3[normalize-space()='Change User Password']")).click();
        WebElement role=driver.findElement(By.xpath("//select[@id='roleId']"));
        Select rl=new Select(role);
        rl.selectByVisibleText("Suppliers");
        driver.findElement(By.xpath("//input[@placeholder='Enter UserName']")).sendKeys("deeya@gmail.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("dddde");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        
        
        driver.get("https://training1.effigo.in/portal/");
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("dddde");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
        driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("dddde");
        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        
        driver.get("https://training1.effigo.in/portal/");
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("deeya@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
        
        
        
   
        
        
	}
}
