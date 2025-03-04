package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
@BeforeSuite
	
	void BS()
	{
		System.out.println("This is BeforeSuite method");
	}
	@AfterSuite
	void AS()
	{
		System.out.println("This is AfterSuite method");
	}
	@BeforeTest
	void xyz()
	{
		System.out.println("This BeforeTest method");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is AfterTest method");
	}


	@BeforeClass
	void bc()
	{
		System.out.println("This is BeforeClass method");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("this is AfterClass method");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("This is BeforeMethod");
	}
	@AfterMethod
	void Am()
	{
		System.out.println("this is AfterMethod");
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
	

}
