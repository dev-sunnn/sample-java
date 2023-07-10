package com.example.app.sample.extendSample.from;

import com.example.app.sample.extendSample.animal.Animal;

public class AnimalDirectManager {
    public static void main(String[] args){
        Animal animal = new Animal();

        animal.setName("Pochi");
        animal.setBirthDay("2020/06/19");
        animal.setSex("Male");

        System.out.println("animal info.\n"
            + "\tname:" + animal.getName()
            + "\n\tbirth day:" + animal.getBirthDay()
            + "\n\tsex:" + animal.getSex()
            + "");

        animal.eat("meat");
        animal.excretion();
        animal.sleep(8);
    }  
}
