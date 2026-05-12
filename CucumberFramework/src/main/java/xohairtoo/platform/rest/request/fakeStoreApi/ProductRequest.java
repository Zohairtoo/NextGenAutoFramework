package xohairtoo.platform.rest.request.fakeStoreApi;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.is;
import static xohairtoo.config.GlobalConstant.FAKE_STORE_API_URL;

import org.springframework.stereotype.Service;
import xohairtoo.platform.rest.request.AbstractRequests;

import java.util.Map;

@Service
public class ProductRequest extends AbstractRequests {

    public <T> JsonPath getProductList(final Map<String, Object> cookie, final Map<String, Object> headers, final T body){
        return getDefaultRestCall(FAKE_STORE_API_URL  +"/products", ContentType.JSON, headers, is(200), cookie);
    }
}
