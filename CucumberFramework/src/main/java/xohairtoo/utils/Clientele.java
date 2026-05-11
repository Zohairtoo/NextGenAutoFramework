package xohairtoo.utils;

import jakarta.annotation.Resource;
import lombok.Getter;
import org.springframework.stereotype.Component;
import xohairtoo.config.SessionProperty;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class Clientele {

    @Resource
    SessionProperty sessionProperty;

    private final Map<String, Client> Clients = new HashMap<>();

    private void initiate(){
        createClient("tesFirstName", "LastName", "tautomatorai@gmail.com");
    }

    private Client createClient(String firstName, String lastName, String email){

        Client client = Client.builder().firstName(firstName).lastName(lastName).email(email).build();
        return client;
    }

}
