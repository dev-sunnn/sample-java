package com.example.app.sample.extendSample.from;

import com.example.app.sample.extendSample.animal.ext.Penguin;

public class PenginManager {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.setName("Bill");
        penguin.setBirthDay("2000/12/03");
        penguin.setSex("Male");

        penguin.outputMyInfo();
        System.out.println("\n--------------------\n");
        penguin.outputBothName();
    }
}
