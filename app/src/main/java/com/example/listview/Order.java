package com.example.listview;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product("Product 1","124"));
        products.add(new Product("Product 2","345"));
        products.add(new Product("Product 3","345"));
    }

    public static class Product{
        public String productName;
        public String price;

        Product(String productName, String price){
            this.productName = productName;
            this.price = price;
        }
    }


}
