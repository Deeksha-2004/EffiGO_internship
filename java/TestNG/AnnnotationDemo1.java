package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnnotationDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("this is advanced search");
		
	}
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout");
	}

}
