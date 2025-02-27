package Feb_27_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");

		driver.manage().window().maximize();
		
		//1.find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		
//		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("number of rows:"+rows);
		
		
		//2.find total number of columns in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		int cols=driver.findElements(By.tagName("th")).size();
		System.out.println("Number of columns is:"+cols);
		
		
		//3. read data from specific row and cols
		
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		System.out.println(bookname);
		
		
		//4. read data from all the rows and cols
		
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"price");
		/*for(int i=2;i<=rows;i++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
			}
			System.out.println();
		}*/
		
		//print book names whose author is mukesh
		
		/*for(int r=2;r<=rows;r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Mukes"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+"\t"+authorname);
			}
		}
		*/
		
		//6. find total price of all books
		
		/*for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			System.out.println(price);
		}*/
		
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("total price of the books:"+total);
		

	}

}
