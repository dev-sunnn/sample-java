package com.example.app.sample.referenceSample.reference;

public class AddresChecker {
    public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    int b[] = a;

    outputValues(a, "a");
    outputValues(b, "b");

    b[1] = 200;
    b[3] = 400;

    System.out.println("b updated.");
    outputValues(a, "a");
    outputValues(b, "b");
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
