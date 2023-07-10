package com.example.app.sample.referenceSample.basic;

public class CallByValueSample {
    public static void main(String[] args) {
        int number = 100;

        System.out.println("number:" + number);
        System.out.println("----------------");

        updateNumber(number);

        System.out.println("----------------");
        System.out.println("number:" + number);
    }

    private static void updateNumber(int number) {
        number += 1000;

        System.out.println("updated@updateNumber:" + number);
    }
}
