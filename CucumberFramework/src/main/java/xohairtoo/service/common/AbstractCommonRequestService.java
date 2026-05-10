package xohairtoo.service.common;

import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xohairtoo.platform.rest.request.fakeStoreApi.CartRequest;
import xohairtoo.platform.rest.request.fakeStoreApi.ProductRequest;
import xohairtoo.platform.rest.request.fakeStoreApi.UserRequest;

@Service
public abstract class AbstractCommonRequestService {

    private static Logger log = LoggerFactory.getLogger(AbstractCommonRequestService.class);

    @Resource
    ProductRequest productRequest;
    @Resource
    CartRequest cartRequest;
    @Resource
    UserRequest userRequest;


}
