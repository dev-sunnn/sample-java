package com.example.app.sample.classSample;

import com.example.app.sample.classSample.ref.ReferenceClass;

public class MainClass {
public static void main(String[] args){
        ReferenceClass referenceClass = new ReferenceClass();

        System.out.println("----------");
        referenceClass.setName("name set from MainClass");
        referenceClass.setNumber(1000000);
        System.out.println("----------");
        referenceClass.outputMember();
    }
}
