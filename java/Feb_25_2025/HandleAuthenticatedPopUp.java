package Feb_25_2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax:
		//http://username:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
