package com.example.hemadry.food;

import java.util.ArrayList;
import java.util.List;

public class Detail {
    private String name;
    private String detail;
    private int price;
    private int image;

    public Detail(String name, String detail, int price, int image) {
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.image = image;
    }

    public Detail(String name, String address, String productName, String item, String phoneNumber) {
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public static List<Detail>foodDetail()
    {
        List<Detail>details = new ArrayList<>();
        details.add(new Detail(""," ",120,R.drawable.pizzs));
        details.add(new Detail(""," ",150,R.drawable.european));
        details.add(new Detail("","",150 ,R.drawable.dish));
        details.add(new Detail("","",150,R.drawable.osteria));
        details.add(new Detail(""," ",150,R.drawable.pizzcake));
        details.add(new Detail("","",150,R.drawable.tomato));
        details.add(new Detail("","",150,R.drawable.images));
        details.add(new Detail(""," ",150,R.drawable.osteria));

        return details;
    }
}
