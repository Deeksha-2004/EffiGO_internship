package Mar_12_2025;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
public class JSONSchemaValidation {
	@Test
	void jsonschemavalidation()
	{
		given()
		.when()
		.get("http://localhost:3000/book")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		  
		
	}

}
