package com.Stream_Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWords {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup" , null , "forest" , "sky" , "book" , null, "theatre");

        // Filter out the words which are not null and store them in another list
        List<String> actualWords;

        actualWords = words.stream().filter( word -> word != null ).collect(Collectors.toList());

        System.out.println(actualWords);
    }
}
