package AutomationPractice_08_05_2025;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrollable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/sortable");

        //GO TO DEMO-TAB
        WebElement list = driver.findElement(By.id("demo-tab-list"));
        list.click();

        // Get all list items
        List<WebElement> items = driver.findElements(By.cssSelector("#demo-tabpane-list div[class*='list-group-item']"));
        for (WebElement item : items) {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", item);
            System.out.println("Item: " + item.getText());
        }

       
    }


	}


