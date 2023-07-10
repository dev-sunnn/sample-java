package com.example.app.sample.extendSample.animal;

public class Animal {

    private String name;
    private String birthDay;
    private String sex;

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getBirthDay() {
    return birthDay;
    }

    public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
    }

    public String getSex() {
    return sex;
    }

    public void setSex(String sex) {
    this.sex = sex;
    }

    public void eat(String food) {
    System.out.println("eat " + food);
    }

    public void excretion() {
    System.out.println("excretion");
    }

    public void sleep(int hour) {
    System.out.println("sleep " + hour + " hour(s)");
    }

}
