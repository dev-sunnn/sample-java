package com.example.app.sample.classSample.ref;

public class ReferenceClass {

    private String name = "";
    private int number = 0;

    public void outputMember() {
        System.out.println("name:" + this.name);
        System.out.println("number:" + this.number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.warnUpdate("name");
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.warnUpdate("number");
        this.number = number;
    }

    private void warnUpdate(String memberName) {
        System.out.println("update " + memberName + " from other Class.");
    }
}
