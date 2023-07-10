package com.example.app.sample.methodSample;

import java.util.Random;

public class SplitMethod {
    public static void main(String[] args) {

        // 乱数を生成
        Random rnd = new Random();

        /** ３科目の成績を乱数より取得 */

        // 国語
        int jpn = rnd.nextInt(101);
        judgeJpn(jpn);

        // 社会
        int soc = rnd.nextInt(101);
        judgeSoc(soc);

        // 算数
        int math = rnd.nextInt(101);
        judgeMath(math);
    }
    
    private static void judgeJpn(int points){
        System.out.println("国語：" + points);
        if (points >= 60) {
            System.out.println("\t国語は合格");
        } else {
            System.out.println("\t国語は不合格");
        }
    }

    private static void judgeSoc(int points){
        System.out.println("社会：" + points);
        if (points >= 60) {
            System.out.println("\t社会は合格");
        } else {
            System.out.println("\t社会は不合格");
        }
    }

    private static void judgeMath(int points){
        System.out.println("算数：" + points);
        if (points >= 60) {
            System.out.println("\t算数は合格");
        } else {
            System.out.println("\t算数は不合格");
        }
    }

}
