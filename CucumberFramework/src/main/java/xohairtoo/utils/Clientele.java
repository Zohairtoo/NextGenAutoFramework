package xohairtoo.utils;

import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import xohairtoo.config.SessionProperty;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
@Setter
public class Clientele {

    @Resource
    SessionProperty sessionProperty;

    private final Map<String, Client> Clients = new HashMap<>();

    private void initiate(){
        createClient("tesFirstName", "LastName", "tautomatorai@gmail.com");
    }

    private void createClient(String firstName, String lastName, String email){

        Client person = Client.builder().firstName(firstName).lastName(lastName).email(email).build();
    }

}
