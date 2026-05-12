package xohairtoo.config;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SessionProperty {

    @Resource
    private ConfigProperty configProperty;
    private List<String> products; // better would be to create bjects for them
    private List<String> users;
    private List<String> carts;
}
