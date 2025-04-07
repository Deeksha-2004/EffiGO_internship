package User_Creation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_password {

    @Test
    public void updatePassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/upeg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("userNameId")).sendKeys("Aarav");
        driver.findElement(By.id("passwordId")).sendKeys("aaaa");
        driver.findElement(By.id("sighInId")).click();

        driver.findElement(By.xpath("//input[@placeholder='Old Password']")).sendKeys("aaaa");
        driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }
}
