package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	//constructor
	
	public LoginPage(WebDriver driver)
	 {		this.driver=driver;
	 
		
	 }
	
	//Locators
	By txt_username_loc=By.xpath("//input[@name='username']");
	By txt_password_loc=By.xpath("//input[@name='password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	
	//Actions
	
	public void setusername(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setpassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void login() {
		driver.findElement(btn_login_loc).click();
	}

	

}
