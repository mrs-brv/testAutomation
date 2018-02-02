package restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Config {

    public RequestSpecification requestSpecification = new RequestSpecBuilder()
//            .addCookie()
//            .addHeader("Autorisation", "asd")
            .setContentType(ContentType.JSON)
            .build();

    @BeforeEach
    public void before(){
        System.out.println("======BeforeEach REST ASSURED ======");
    }

    @BeforeAll
    public static void setUp (){
        System.out.println("======BeforeAll REST ASSURED ======");
        RestAssured.baseURI = DataTest.baseUri;
        RestAssured.basePath = DataTest.basePath;
    }
}
