package User_Creation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User_login {

    @Test
    public void loginWithNewPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/upeg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("userNameId")).sendKeys("Aarav");
        driver.findElement(By.id("passwordId")).sendKeys("Bob@1234");
        driver.findElement(By.id("sighInId")).click();
    }
}
