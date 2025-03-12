package Mar_12_2025;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	
	
	@Test
	void testGenerateDummyData()
	{
		Faker faker=new Faker();
		String fullname=faker.name().fullName();
		String firstname=faker.name().firstName();
		String lastname=faker.name().lastName();
		
		String username=faker.name().username();
		String password=faker.internet().password();
		
		String phoneno=faker.phoneNumber().cellPhone();
		
		String email=faker.internet().safeEmailAddress();
		
//		faker.color();
//		faker.animal().name();
		
		System.out.println("Full name:"+fullname);
		System.out.println("first name:"+firstname);
		System.out.println("last name:"+lastname);
		System.out.println("user name:"+username);
		System.out.println("password:"+password);
		System.out.println("phone no:"+phoneno);
		System.out.println("email:"+email);
	}

}
