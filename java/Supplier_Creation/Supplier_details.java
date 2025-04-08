package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Supplier_details {
	
	@Test
	public void supplier_info()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://training1.effigo.in/admin/");
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
        driver.findElement(By.xpath("//input[@id='regiNumber']")).sendKeys("198076");
        driver.findElement(By.xpath("//input[@id='panNum']")).sendKeys("JKLMN3478Y");
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
        driver.findElement(By.xpath("//input[@id='companyEmail']")).sendKeys("boookk12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("9988009988");
        driver.findElement(By.xpath("//input[@id='gstNum']")).sendKeys("29ABCDE1234F1Z5");
        driver.findElement(By.xpath("//input[@id='contactPerson']")).sendKeys("Deeya");
        driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8899009900");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deeyaaa12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='loginUser']")).sendKeys("");
        driver.findElement(By.xpath("//label[normalize-space()='Save']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Click']")).click();
	}

}
