package com.java8.java.imperativeVSdeclarative;

import java.util.stream.IntStream;

public class ImperativeVSDeclarativeExample1 {
    /**
     * Sum from 0 to 100
     */
    public static void main(String[] args) {
        /**
         * Imperative
         * the sum variable needs to be mutated for every iteration of the loop.
         * This involves creating a new integer object on every iteration,
         * which can be a performance overhead if the loop is executed many times.
         * Additionally, if you want to parallelize the loop to take advantage of multiple CPU cores,
         * you would need to write additional code to manage the threads.
         */
        int sum = 0; // sum keeps being mutated
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("Sum use IMP: " + sum);


        /**
         * Declarative
         * using IntStream allows you to express the same logic in a more concise and expressive way,
         * without the need for manual mutation of variables.
         * Additionally, the parallel() method allows you to easily parallelize the stream,
         * which can improve performance on multi-core machines.
         */
        int sum2 = IntStream.rangeClosed(0,100)
                .parallel()
                .sum();

        System.out.println("Sum us DEC: " + sum2);
    }
}
