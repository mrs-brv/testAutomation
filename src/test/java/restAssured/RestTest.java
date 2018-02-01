package restAssured;


import com.jsystems.models.MyObj;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;



public class RestTest extends Config{
    @Test
    public void firstTest(){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/5a6b69ec3100009d211b8aeb")
//                .get("http://www.mocky.io/v2/5a6b69ec3100009d211b8aeb")
                .then()
                .assertThat()
                .statusCode(200)
                .body("name", equalTo("Piotr"))
                .body("surname", equalTo("Kowalski"));
    }
    @Test
    public void firstTestinaczej(){
        JsonPath jsonPath = given()
                .when()
                .get("/5a6b69ec3100009d211b8aeb")
//                .get("http://www.mocky.io/v2/5a6b69ec3100009d211b8aeb")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath();
        MyObj myObj = jsonPath.getObject("", MyObj.class);
        System.out.println(myObj);
        assertThat(myObj.name).isEqualTo("Piotr");
        assertThat(myObj.surname).isEqualTo("Kowalski");

    }

    //http://www.mocky.io/v2/5a6a58222e0000d0377a7789
    @Test
    public void secondTest(){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/5a6a58222e0000d0377a7789")
//                .get("http://www.mocky.io/v2/5a6a58222e0000d0377a7789")
                .then()
                .assertThat()
                .statusCode(200)
                .body("[0].imie", is("Piotr"))
                .body("[0].nazwisko", equalTo("Kowalski"))
                .body("[0].device[0].type", equalTo("computer"));

    }
}
