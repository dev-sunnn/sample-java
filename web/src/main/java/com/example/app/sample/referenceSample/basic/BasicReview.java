package com.example.app.sample.referenceSample.basic;

public class BasicReview {
    public static void main(String[] args) {
    int a = 100;
    int b = a;

    System.out.println("a:" + a + ", b:" + b);

    b = 200;
    System.out.println("b updated.");
    System.out.println("a:" + a + ", b:" + b);
    }
}
