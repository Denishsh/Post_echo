import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostTest {
    @Test
    void postTest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", Matchers.equalTo("some data"))
                .body("headers.content-type", Matchers.equalTo("text/plain; charset=ISO-8859-1"))
        ;
    }

}
