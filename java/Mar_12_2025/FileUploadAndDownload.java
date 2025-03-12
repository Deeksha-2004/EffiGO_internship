package Mar_12_2025;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;
public class FileUploadAndDownload {
	
	@Test
	void singleFileUpload()
	{
		File myfile=new File("C:\\Selenium\\Test1.txt");
		given()
		.multiPart("file",myfile)
		.contentType("multipart/form-data")
		
		.when()
		.post("http://localhost:8000/uploadFile")
		.then()
		.statusCode(200)
		.body("fileName",equalTo("Test1.txt"))
		.log().all();
		
		
	}

}
