package com.example.app.sample.listSample;

import java.util.ArrayList;
import java.util.List;

public class SearchColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("black");
        for(int i = 0; i < colors.size(); i++){
            System.out.println("counter:" + i + ":" + colors.get(i));
        }
        // 値があるかないか
        System.out.println("contains:" + colors.contains("yellow"));
        // 先頭から検索
        System.out.println("indexOf:" + colors.indexOf("yellow"));
        // 最後から検索
        System.out.println("lastIndexOf:" + colors.lastIndexOf("yellow"));
    }
}
