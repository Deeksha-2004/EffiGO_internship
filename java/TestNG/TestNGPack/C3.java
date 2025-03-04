package TestNG.TestNGPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void mno()
	{
		System.out.println("This mno from c3");
	}
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

}
