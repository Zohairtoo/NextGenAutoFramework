package xohairtoo.platform.rest.request;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import xohairtoo.config.ConfigProperty;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matcher;
import com.google.gson.Gson;

import java.io.File;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static xohairtoo.config.GlobalConstant.DOCUMENT_PATH;

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

    /**
     * Builds a POST rest call with a multi-part form data
     *
     * @param path
     * @param contentType
     * @param headers
     * @param fileName
     * @param statusCode
     * @param requestBody
     * @return {@link JsonPath}
     */
    protected <T> JsonPath postDefaultRestCall(final Map<String, Object> cookies, final String path, final String contentType,
                                               final Map<String, Object> headers, final String fileName, final T requestBody, final Matcher statusCode)
    {
        final String responseBody = given().config(RestAssured.config()).cookies(cookies).contentType(contentType).headers(headers)
                .multiPart("file", new File(DOCUMENT_PATH + fileName)).multiPart("payload", requestBody.toString()).log().all().when()
                .post(path).then().log().all().statusCode(statusCode).extract().response().getBody().asString();
        return JsonPath.from(responseBody);
    }

    /**
     * Builds a PUT rest call.
     *
     * @param path
     * @param requestBody
     * @param contentType
     * @param headers
     * @param cookies
     * @param statusCode
     * @return {@link JsonPath}
     */
    protected <T> JsonPath putDefaultRestCall(final String path, final T requestBody, final ContentType contentType,
                                              final Map<String, Object> headers, final Map<String, Object> cookies, final Matcher statusCode)
    {
        final String payload = new Gson().toJson(requestBody);
        return given().config(RestAssured.config()).contentType(contentType).headers(headers).cookies(cookies).body(payload).log()
                .all().when().put(path).then().log().all().statusCode(statusCode).extract().response().jsonPath();
    }

    /**
     * Builds a delete rest call.
     *
     * @param path
     * @param contentType
     * @param headers
     * @param cookies
     * @param statusCode
     * @return {@link JsonPath}
     */
    protected JsonPath deleteDefaultRestCall(final String path, final ContentType contentType, final Map<String, Object> headers,
                                             final Map<String, Object> cookies, final Matcher statusCode)
    {
        return given().config(RestAssured.config()).contentType(contentType).headers(headers).cookies(cookies).log().all().when()
                .delete(path).then().log().all().statusCode(statusCode).extract().response().jsonPath();
    }
}
