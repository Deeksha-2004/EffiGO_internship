package User_Creation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class User_info {

    @Test
    public void UserInfo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/admin/");
        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//button[@type='button']")).click();

        
        driver.findElement(By.xpath("//h3[normalize-space()='User Creation']")).click();
        driver.findElement(By.id("adduser")).click();
        

        Select bUnit = new Select(driver.findElement(By.id("department")));
        bUnit.selectByVisibleText("Construction");

        driver.findElement(By.id("userName")).sendKeys("Aarav");
        new Select(driver.findElement(By.id("designation"))).selectByVisibleText("Manager");
        driver.findElement(By.id("firstName")).sendKeys("Aarav");
        driver.findElement(By.id("lastName")).sendKeys("Shet");
        driver.findElement(By.id("mobile")).sendKeys("9988776655");
        driver.findElement(By.id("email")).sendKeys("aar123@gmail.com");
        new Select(driver.findElement(By.id("locationId"))).selectByVisibleText("kashi");

       
        String[] roles = {
            "isHod", "admin", "categoryApprover", "buHead", "report", "vendorAdmin",
            "catalogCreation", "catalogApproval", "catalogexpire", "requisitionCreation",
            "requisitionApproval", "poCreation", "poApproval", "grnCreation", "grnApproval",
            "eventCreate", "eventEdit", "eventDelete", "tendercreator"
        };
        for (String role : roles) {
            driver.findElement(By.xpath("//label[@for='" + role + "']")).click();
        }

        new Select(driver.findElement(By.id("categorysId"))).selectByVisibleText("cat-2");

        driver.findElement(By.id("createClientUserBtn")).click();
    }
}
