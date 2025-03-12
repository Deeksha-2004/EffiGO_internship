package Mar_12_2025;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class SerializationDeserialization {
	
	
	//POJO ---- JSON
	//@Test
	void covertPOJO2Json() throws JsonProcessingException
	{
		Student stupojo=new Student();
		stupojo.setName("Akshay");
		stupojo.setLocation("france");
		stupojo.setPhone("12345");
		String coursearr[]= {"C","C++"};
		stupojo.setCourses(coursearr);
		
		
		//convert java object to json object
		ObjectMapper objmapper=new ObjectMapper();
		
		String jsondata=objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(stupojo);
		System.out.println(jsondata);
		
	}
	
	
	//JSON ---POJO
	
	@Test
	void convertJson2Pojo() throws JsonMappingException, JsonProcessingException
	{
		String jsondata= "{\r\n"
				+ "  \"name\" : \"Akshay\",\r\n"
				+ "  \"location\" : \"france\",\r\n"
				+ "  \"phone\" : \"12345\",\r\n"
				+ "  \"courses\" : [ \"C\", \"C++\" ]\r\n"
				+ "}";
		//convert jsondata into pojo object
		
		ObjectMapper stuobj=new ObjectMapper();
		Student stu=stuobj.readValue(jsondata,Student.class);
		System.out.println("Name:"+stu.getName());
		System.out.println("Location:"+stu.getLocation());
		System.out.println("Phone:"+stu.getPhone());
	    System.out.println("Course 1:"+stu.getCourses()[0]);
		System.out.println("Course 1:"+stu.getCourses()[1]);
		
	}

}
