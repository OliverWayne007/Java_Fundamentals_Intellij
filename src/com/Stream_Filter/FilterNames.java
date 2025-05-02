package com.Stream_Filter;

import java.util.Arrays;
import java.util.List;

public class FilterNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre" , "Sansa" , "Jon" , "Daenerys" , "Joffery");

        System.out.println(names);

        names.stream().filter( (name) -> { return (name.length() > 6 && name.length() < 8); } )
                .forEach( (name) -> { System.out.println(name); } );
    }
}
