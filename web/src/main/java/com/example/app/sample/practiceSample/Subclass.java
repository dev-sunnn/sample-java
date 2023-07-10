package com.example.app.sample.practiceSample;

public class Subclass extends Superclass {

    Subclass() {
        System.out.print("B0 ");
    }

    Subclass(int b) {
        super(b);
        System.out.print("B" + b +" ");
    }
}
