package xohairtoo.platform.rest.request;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import xohairtoo.config.ConfigProperty;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matcher;

import java.util.Map;

import static io.restassured.RestAssured.given;

@Service
public abstract class AbstractRequests {

    @Resource
    ConfigProperty configProperty;

    /**
     * Builds a basic GET rest call with status code
     *
     * @param path
     * @param contentType
     * @param headers
     * @param statusCode
     * @param cookies
     * @return {@link JsonPath}
     */
    protected JsonPath getDefaultRestCall(final String path, final ContentType contentType, final Map<String, Object> headers,
                                          final Matcher statusCode, final Map<String, Object> cookies)
    {
        return given().config(RestAssured.config()).cookies(cookies).contentType(contentType).headers(headers).log().all().when()
                .get(path).then().log().all().statusCode(statusCode).extract().response().jsonPath();
    }
}
