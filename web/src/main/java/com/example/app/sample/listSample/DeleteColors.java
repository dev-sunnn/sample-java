package com.example.app.sample.listSample;

import java.util.ArrayList;
import java.util.List;

public class DeleteColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        for(int i = 0; i < colors.size(); i++){
            System.out.println("counter:" + i + ":" + colors.get(i));
        }

        // インデックスを指定して、要素を削除する
        colors.remove(2);

        System.out.println(colors);
        for(int i = 0; i < colors.size(); i++){
            System.out.println("counter:" + i + ":" + colors.get(i));
        }

        // 要素を全て削除する
        colors.clear();

        System.out.println(colors);
        System.out.println(colors.size());
    }
}

