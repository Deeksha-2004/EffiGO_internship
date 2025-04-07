package User_Creation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Change_Password {

    @Test
    public void changeUserPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/admin/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("username")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        

        driver.findElement(By.xpath("//h3[normalize-space()='Change User Password']")).click();
        new Select(driver.findElement(By.id("roleId"))).selectByVisibleText("Clients");
        driver.findElement(By.xpath("//input[@placeholder='Enter UserName']")).sendKeys("Aarav");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.id("password_1")).sendKeys("aaaa");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }
}
