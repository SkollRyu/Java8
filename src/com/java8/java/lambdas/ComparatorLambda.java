package com.java8.java.lambdas;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {

        // before java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // o1 == o2 -> 0
                // o1 > o2 -> 1
                // o1 < o2 -> -1
            }
        };

        System.out.println(comparator.compare(3,2));

        // lambda way
        Comparator<Integer> comparator1 = (Integer o1, Integer o2)->{
            return o1.compareTo(o2);
        };

        System.out.println(comparator.compare(3,2));

        // even simpler, cuz it smart to know
        Comparator<Integer> comparator2 = ( o1,  o2)->{
            return o1.compareTo(o2) * -1; // I add -1 to show that it is inter-changeable
        };
    }
}
