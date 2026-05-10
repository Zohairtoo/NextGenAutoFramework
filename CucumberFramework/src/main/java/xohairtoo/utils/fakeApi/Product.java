package xohairtoo.utils.fakeApi;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private Integer price;
    private String description;
    private String category;
    private String image;
}