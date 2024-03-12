package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }
        Stream<Integer> integerStream=integerList.stream();
        int value=integerStream.mapToInt(Integer::intValue)
                .sum();
        System.out.println(value);

    }
}