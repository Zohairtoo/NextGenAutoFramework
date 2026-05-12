package xohairtoo.utils.fakeApi;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Builder
@Getter
@Setter
public class Cart {
    private int id;
    private String userId; // id from the user object
    private HashMap<String, Product> products;
}