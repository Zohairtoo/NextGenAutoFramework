package xohairtoo.utils;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Client {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
