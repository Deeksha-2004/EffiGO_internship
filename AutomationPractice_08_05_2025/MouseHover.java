package AutomationPractice_08_05_2025;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");

        try {
            
            WebElement mainItem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Main Item 2']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mainItem2);

            
            if (mainItem2.isDisplayed() && mainItem2.isEnabled()) {
                actions.moveToElement(mainItem2).perform();
            } else {
                System.out.println("Main Item 2 is not interactable.");
            }


            WebElement subSubList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SUB SUB LIST »']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subSubList);

            if (subSubList.isDisplayed() && subSubList.isEnabled()) {
                actions.moveToElement(subSubList).perform();
            } else {
                System.out.println("Sub Sub List is not interactable.");
            }
            WebElement subSubItem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sub Sub Item 2']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subSubItem2);  
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            driver.quit();
	}

}
}
