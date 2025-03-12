package Mar_12_2025;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class DeleteUser {
	
	@Test
	void test_deleteuser(ITestContext context)
	{
		
//		String bearertoken="f749c98ce2ba9cea7b268c89ad31e000cd70e4d898c6b202a453885c25c1d9a5";
//		int id=(Integer) context.getAttribute("user_id");
//		given()
//		.headers("Authorization", "Bearer " +bearertoken)
//		.pathParam("id",id)
//		
//		.when()
//		.delete("https://gorest.co.in/public/v2/users/{id}")
//		.then()
//		.statusCode(204)
//		.log().all();
		
	}

}
