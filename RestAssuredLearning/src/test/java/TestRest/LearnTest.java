package TestRest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class LearnTest {	

	@Test 
public void Test02(){
		given().get("https://reqres.in/api/users?page=2").
		 then().
		 statusCode(200).
		 body("data.id[0]",equalTo(7)).
		 body("data.first_name",hasItems("Michael","Lindsay"));
		 //log().all();

	
}
}
