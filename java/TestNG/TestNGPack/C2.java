package TestNG.TestNGPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void pqr()
	{
		System.out.println("This is pqr from c2");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is AfterTest method");
	}

}
