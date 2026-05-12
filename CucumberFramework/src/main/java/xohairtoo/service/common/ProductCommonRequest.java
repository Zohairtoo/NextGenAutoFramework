package xohairtoo.service.common;

import io.restassured.path.json.JsonPath;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductCommonRequest extends AbstractCommonRequestService{

    public <T> JsonPath createProductIfNotExist(){
        return null;
    }

    public <T> JsonPath updateProduct(){
        return null;
    }

    public <T> JsonPath deleteProduct(){
        return null;
    }

    public <T> JsonPath getListOfProducts(final Map<String, Object> cookie, Map<String, Object> headers, final T body){
        final JsonPath response = productRequest.getProductList(cookie, headers, body);
        log.info(response.prettyPrint());
        return response;
    }
}
