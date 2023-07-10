package com.example.app.sample.methodSample;

import java.util.Random;

public class OptimizeMethod {
    public static void main(String[] args) {

        // 乱数を生成
        Random rnd = new Random();

        /** ３科目の成績を乱数より取得 */

        // 国語
        int jpn = rnd.nextInt(101);
        judgePoints("国語", jpn);

        // 社会
        int soc = rnd.nextInt(101);
        judgePoints("社会", soc);

        // 算数
        int math = rnd.nextInt(101);
        judgePoints("算数", math);
    }

    private static void judgePoints(String subject, int points){
        System.out.println(subject + "：" + points);
        if (points >= 60) {
            System.out.println("\t" + subject + "は合格");
        } else {
            System.out.println("\t" + subject + "は不合格");
        }
    }
}
