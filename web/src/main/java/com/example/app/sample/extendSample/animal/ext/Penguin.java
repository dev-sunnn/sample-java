package com.example.app.sample.extendSample.animal.ext;

import com.example.app.sample.extendSample.animal.Animal;

public class Penguin extends Animal{
    private String name = "Penguin sub.";
    
    public void outputMyInfo(){
        System.out.println("Penguin info.\n"
            + "\tname:" + super.getName()
            + "\n\tbirth day:" + super.getBirthDay()
            + "\n\tsex:" + super.getSex()
            + "");
    }

    public void outputBothName(){
        System.out.println("Super.name:" + super.getName()
            + ", sub Name:" + this.name);
    }

    public void swim(){
        System.out.println("swiming");
    }
}
