package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
WebDriver driver;
	
	//constructor
	
	public LoginPage2(WebDriver driver)
	 {		this.driver=driver;
	 		PageFactory.initElements(driver,this);		
	 }
	
	//Locators
	//@FindBy(xpath="//input[@name='username']") 
	
	@FindBy(how=How.XPATH,using="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement btn_login;
	//Actions
	
	public void setusername(String user) {
		txt_username.sendKeys(user);
	}
	
	public void setpassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void login() {
		btn_login.click();
	}


}
