package TestNG.TestNG_04_03_2025;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
		
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFaceBook()
	{
		System.out.println("this is login by FaceBook");
		
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is login by twitter");
	}

}
