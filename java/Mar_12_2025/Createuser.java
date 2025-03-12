package Mar_12_2025;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class Createuser {
	
	
	@Test
	void test_createuser(ITestContext context)
	{
		Faker faker=new Faker();
		JSONObject data=new JSONObject();
		data.put("name",faker.name().fullName());
		data.put("gender","Male");
		data.put("email",faker.internet().emailAddress());
		data.put("status","inactive");
		
		
//		String bearertoken="f749c98ce2ba9cea7b268c89ad31e000cd70e4d898c6b202a453885c25c1d9a5";
//		int id=given()
//		.headers("Authorization", "Bearer " +bearertoken)
//		.contentType("application/json")
//		.body(data.toString())
//		.when()
//		.post("https://gorest.co.in/public/v2/users")
//		.jsonPath().getInt("id");
//		System.out.println("generated id is:"+id);
//		
//		context.setAttribute("user_id",id);
//		
	}

}
