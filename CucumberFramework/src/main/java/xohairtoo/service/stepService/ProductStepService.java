package xohairtoo.service.stepService;

import io.cucumber.core.exception.CucumberException;

public interface ProductStepService {

    /**
     * get list of products
     */
    default void getListOfProducts(){
        throw new CucumberException("The implementation is not present for activated profile");
    }
}
