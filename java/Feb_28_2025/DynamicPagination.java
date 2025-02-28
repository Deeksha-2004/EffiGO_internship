package Feb_28_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//showing 1 to 10 pages
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		
		for (int p = 1; p <= 5; p++) {
            if (p > 1) {
                WebElement pageElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='pagination']//*[text()='" + p + "']")));
                
                // Scroll into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageElement);
                
                try {
                    pageElement.click();  // Normal click
                } catch (ElementClickInterceptedException e) {
                    // JavaScript click if normal click fails
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pageElement);
                }

                Thread.sleep(3000);
            }

            int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            for (int r = 1; r <= noOfRows; r++) {
                String customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[2]")).getText();
                String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[3]")).getText();
                String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[5]")).getText();

                System.out.println(customername + "\t" + email + "\t" + status);
            }
        }

        driver.quit();
    }
}