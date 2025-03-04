package TestNG.TestNG_04_03_2025;

import org.testng.annotations.Test;

public class SignUpTesta {
	@Test(priority=1,groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("this is signup by email");
	}
	@Test(priority=2,groups= {"regression"})
	void signupByFaceBook()
	{
		System.out.println("this is signup by FaceBook");
	}
	@Test(priority=3,groups= {"regression"})
	void signupByTwitter()
	{
		System.out.println("this is signup by twitter");
	}

}
