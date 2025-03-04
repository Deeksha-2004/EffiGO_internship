package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
	/*void test_hardassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(1,2);//hard assertion- if the condition fails it will not execute further
		
		
		System.out.println("testing...");
		System.out.println("testing...");
		
	}*/
	
	void test_softassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2); //soft assertion
		
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		sa.assertAll(); //this is mandatory
		
	}

}
