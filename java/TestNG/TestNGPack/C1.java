package TestNG.TestNGPack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void abc()
	{
		System.out.println("This is abc from c1");
	}
	@BeforeTest
	void xyz()
	{
		System.out.println("This BeforeTest method");
	}

}
