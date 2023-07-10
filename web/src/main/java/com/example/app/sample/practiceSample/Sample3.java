package com.example.app.sample.practiceSample;

public class Sample3 {
    public static void main(String[] args) {
        int math = 20;
        int japanese = 60;
        int english = 40;
        int science = 80;
        int society = 50;

        // 5教科の合計
        int sum = math + japanese + english + science + society;

        // 5教科の平均
        int avg = sum / 5;

        System.out.println("5教科の合計：" + sum);
        System.out.println("5教科の平均：" + avg);
    }
}
