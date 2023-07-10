package com.example.app.sample.extendSample.animal.ext;

import com.example.app.sample.extendSample.animal.Animal;

public class Dog extends Animal{
    public void bark() {
        System.out.println("bow wow");
    }

    public void sniffOut(String target) {
        System.out.println("found " + target);
    }
   
}
