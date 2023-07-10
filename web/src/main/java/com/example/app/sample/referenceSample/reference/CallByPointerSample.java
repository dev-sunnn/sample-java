package com.example.app.sample.referenceSample.reference;

public class CallByPointerSample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        outputValues(a, "a");
        System.out.println("----------------");

        updateArray(a);
        outputValues(a, "a");
    }

    private static void updateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
        if (i % 2 != 0) {
            continue;
        }

        array[i] += 1000;
        }
    }

    private static void outputValues(int[] array, String name) {
        String values = "";

        int len = array.length;
        for (int i = 0; i < len; i++) {
        values += array[i];

        if (i != len - 1) {
            values += ", ";
        }
        }

        System.out.println(name + ".values:" + values);
    }
}