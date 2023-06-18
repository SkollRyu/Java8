package com.java8.java.lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        // This part of code show how to implement runnable functions using lambda
        // so that code can be reduced, and easier to write

        // What is runnable?
        // For a method or a class to be executed by a thread
        // PS: this is an old way to use thread <-- performance overhead

        // version 1
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 1");
            }
        };

        new Thread(runnable1).start();

        // lambda it a bit
        Runnable runnable2 = () -> {
            System.out.println("runnable 2");
        };

        new Thread(runnable2).start();

        // optimal way
        new Thread(()-> System.out.println("final runnable 3"));
    }
}
