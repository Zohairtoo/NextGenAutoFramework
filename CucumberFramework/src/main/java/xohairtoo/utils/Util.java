package xohairtoo.utils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.Getter;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import xohairtoo.config.ConfigProperty;

import java.util.HashMap;
import java.util.Map;

@Service
public class Util {

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    @Resource
    private ApplicationContext applicationContext;
    @Resource
    private ConfigProperty configProperty;

    @Getter
    private Map<String, Object> headerParams;

    @Getter
    private Map<String, Object> cookieParams;

    @PostConstruct
    public void withDefaultSessionContext(){
        headerParams = getHeaderParams();
        cookieParams = getCookieParams();
    }

    /**
     * Create default header
     *
     * @return cookie
     */
    private Map<String, Object> cookieParamsMap()
    {
        final Map<String, Object> cookieParams = new HashMap<>();
        return cookieParams;
    }

    /**
     * Create default header
     *
     * @return header
     */
    private Map<String, Object> headerParamsMap()
    {
        final Map<String, Object> headerParams = new HashMap<>();
        headerParams.put("Content-Type", "application/json");
        return headerParams;
    }

}
