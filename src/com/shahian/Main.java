package com.shahian;

import com.shahian.model.Book1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(2, 3, 4, 2, 9, 2, 3, 7, 3, 8, 9, 4, 6, 2, 4, 5, 7, 9, 7, 8, 4, 1, 5, 3, 9, 8, 6, 7, 5, 4, 2, 5, 4, 6, 1);
        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((key,value)->{
            System.out.println(key +" : "+value);
        });

        //or
        System.out.println("------------------another way ---------------");
        integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((c1, c2) -> c2.compareTo(c1)))
                .map(e -> e.getKey() + " : " + e.getValue() + " ")
                .forEach(System.out::println);
    }
}
