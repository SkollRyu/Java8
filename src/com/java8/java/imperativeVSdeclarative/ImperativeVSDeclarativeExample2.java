package com.java8.java.imperativeVSdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVSDeclarativeExample2 {
    /**
     * Remove duplciates from a list of integers
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,4,5,6,3,5,8,9,10,10);
        /**
         * imperative
         */
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer : list){
            if (!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }

        /**
         * declarative
         */
        List<Integer> uniqueList2;
        uniqueList2 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        uniqueList2.forEach(System.out::println);


    }
}
