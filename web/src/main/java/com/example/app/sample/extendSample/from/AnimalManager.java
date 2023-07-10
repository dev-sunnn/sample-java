package com.example.app.sample.extendSample.from;

import com.example.app.sample.extendSample.animal.ext.Cat;
import com.example.app.sample.extendSample.animal.ext.Dog;
import com.example.app.sample.extendSample.animal.ext.Human;

public class AnimalManager {
    public static void main(String[] args) {
        System.out.println("----------using Dog----------");
        callDog();

        System.out.println("\n----------using Cat----------");
        callCat();

        System.out.println("\n----------using Human--------");
        callHuman();
    }

    private static void callDog() {
        Dog dog = new Dog();

        dog.setName("Pochi");
        dog.setBirthDay("2020/06/19");
        dog.setSex("Male");

        System.out.println("dog info.\n"
            + "\tname:" + dog.getName()
            + "\n\tbirth day:" + dog.getBirthDay()
            + "\n\tsex:" + dog.getSex()
            + "");

        dog.eat("meat");
        dog.excretion();
        dog.sleep(8);

        dog.bark();
        dog.sniffOut("bone");
    }

    private static void callCat() {
        Cat cat = new Cat();

        cat.setName("Tama");
        cat.setBirthDay("2015/03/24");
        cat.setSex("Female");

        System.out.println("cat info.\n"
            + "\tname:" + cat.getName()
            + "\n\tbirth day:" + cat.getBirthDay()
            + "\n\tsex:" + cat.getSex()
            + "");

        cat.eat("fish");
        cat.excretion();
        cat.sleep(12);

        cat.clawUp();
    }

    private static void callHuman() {
        Human human = new Human();

        human.setName("Java Tarou");
        human.setBirthDay("1990/04/05");
        human.setSex("Male");

        System.out.println("human info.\n"
            + "\tname:" + human.getName()
            + "\n\tbirth day:" + human.getBirthDay()
            + "\n\tsex:" + human.getSex()
            + "");

        human.eat("hamburger");
        human.excretion();
        human.sleep(6);

        human.speak("working.");
    }
}
