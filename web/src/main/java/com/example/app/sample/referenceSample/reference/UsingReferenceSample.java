package com.example.app.sample.referenceSample.reference;

import com.example.app.sample.referenceSample.reference.data.MyData;

public class UsingReferenceSample {
    public static void main(String[] args) {

        /** 前言したメソッド内で代入までやる */
        MyData self = new MyData();

        self.setNumber(10000);
        self.setName("Object Tarou");
        self.setWord("did it myself");

        outputDataInfo("self", self);

        System.out.println("\n----------\n");

        /** 参照の値渡し */
        MyData pointer = new MyData();
        setMyDataDetail(pointer);
        outputDataInfo("pointer", pointer);

        System.out.println("\n----------\n");

        /** 別メソッドでオブジェクト化、代入をまとめてやる */
        MyData fromReturn = getMyDataHasSet();
        outputDataInfo("fromReturn", fromReturn);
    }

    private static void setMyDataDetail(MyData data) {
        data.setNumber(20000);
        data.setName("Object Pointer");
        data.setWord("pass by reference");
    }

    private static MyData getMyDataHasSet() {
        MyData ret = new MyData();

        ret.setNumber(30000);
        ret.setName("Object Return");
        ret.setWord("init from other method.");

        return ret;
    }

    private static void outputDataInfo(String name, MyData data) {
        System.out.println(name + ":"
            + "\n\tnumber:" + data.getNumber()
            + "\n\tname:" + data.getName()
            + "\n\tword:" + data.getWord()
            );
    }
}
