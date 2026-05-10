package xohairtoo.service.stepService.restStepServiceImpl.fakeStoreApi;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xohairtoo.platform.rest.request.fakeStoreApi.ProductRequest;
import xohairtoo.service.common.ProductCommonRequest;
import xohairtoo.service.stepService.ProductStepService;
import xohairtoo.utils.Util;

@Service
@Profile("rest")
public class ProductStepServiceImpl implements ProductStepService {

    @Resource
    Util util;
    @Resource
    ProductCommonRequest productCommonRequest;
    
    @Resource
    public void getListOfProducts(){
        productCommonRequest.getListOfProducts(util.getCookieParams(), util.getHeaderParams(), null);
    }
}
