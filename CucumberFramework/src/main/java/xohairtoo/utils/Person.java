package xohairtoo.utils;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Builder
@Getter
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
