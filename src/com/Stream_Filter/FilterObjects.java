package com.Stream_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
    int id;
    String name;
    double price;

    Product(int id , String name , double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ " + "id: " + this.id + " , " + "name: " + this.name + " , " + "price: " + this.price + " }";
    }
}

public class FilterObjects {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1 , "Apple" , 100));
        productList.add(new Product(2 , "Mango" , 200));
        productList.add(new Product(3 , "Banana" , 50));
        productList.add(new Product(4 , "Orange" , 20));
        productList.add(new Product(5 , "PineApple" , 150));
        productList.add(new Product(6 , "Guava" , 80));

        // Filtering the products based on their price using streams and storing them in another list
        List<Product> affordableProducts =
                productList.stream()
                .filter( product -> product.price <= 100 )
                .collect(Collectors.toList());

        System.out.println(affordableProducts);
    }
}
