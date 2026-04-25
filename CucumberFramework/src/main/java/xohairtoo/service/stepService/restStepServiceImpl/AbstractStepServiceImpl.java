package xohairtoo.service.stepService.restStepServiceImpl;

import xohairtoo.service.stepService.restStepServiceImpl.commons.CommonStepService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("rest")
public abstract class AbstractStepServiceImpl {

    @Resource
    protected CommonStepService commonStepService;


}
