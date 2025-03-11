package Mar_11_2025;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;



public class ParsingJSONResponse {
	
	//@Test
	void testJSONResponse()
	{
		
		//Approach1
		/*given()
		.contentType("ContentType.JSON")
		.when()
		.get("http://localhost:3000/store")
		
		.then()
		.statusCode(200)
		
		.body("book[3].title",equalTo("The Lord of the rings"));
		*/
		
		//Approach2
		
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/book");
		
		
		Assert.assertEquals(res.getStatusCode(),200); //validation1
		//Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		
		System.out.println(res.getBody().asString());

		String bookname=res.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookname,"The Lord of the rings");
	}
	@Test(priority=2)
	void testJSONResponseBodyData()
	{
		
		Response res=given()
		.accept("application/json")
		.when()
		.get("http://localhost:3000/book");
		/*Assert.assertEquals(res.getStatusCode(),200); //validation1
		//Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		String bookname=res.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookname,"The Lord of the rings");*/
		//JSONObject class
		JSONArray jo=new JSONArray(res.getBody().asString());
		
		boolean status=false;//converting response to json object type
		
		for(int i=0;i<jo.length();i++)
		{
			String book_title=jo.getJSONObject(i).getString("title");
			System.out.println(book_title);
			if(book_title.equals("The Lord of the rings"))
			{
				status=true;
				break;
			}
		}
		Assert.assertEquals(status,true);
		
		double totalprice=0;
		for(int i=0;i<jo.length();i++)
		{
			String price=jo.getJSONObject(i).get("price").toString();
			totalprice=totalprice+Double.parseDouble(price);				
	}
		System.out.println("total price is"+totalprice);
		Assert.assertEquals(totalprice,526.0);

}
}
