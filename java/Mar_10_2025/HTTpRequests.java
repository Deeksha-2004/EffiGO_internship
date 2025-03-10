package Mar_10_2025;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTpRequests {
	
	int id;
	
	 @Test(priority=1)
	void getUsers()
	{
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}	
	@Test(priority=2)
	void createUsers()
	{
		HashMap hm=new HashMap();
		hm.put("name","deeksha");
		hm.put("job","intern");
		id=given()
		.contentType("application/json")
		.body(hm)
		.when() 
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		//.then()
		//.statusCode(201)
		//.log().all();		
	}
	@Test(priority=3,dependsOnMethods= {"createUsers"})
	
		void updateuser()
		{
		HashMap hm=new HashMap();
		hm.put("name","aarav");
		hm.put("job","student");
		
		given()
				.contentType("application/json")
				.body(hm)
				.when()
				.put("https://reqres.in/api/users/2")
				.then()
				.statusCode(200)
				.log().all();
			
		}
	
	
	@Test(priority=4)
	void deleteUser()
	{
		
		given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
		
	}
	
	
	
	
	
	
	
	
	

}
