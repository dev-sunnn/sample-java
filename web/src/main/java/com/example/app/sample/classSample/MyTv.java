package com.example.app.sample.classSample;

public class MyTv {
    // メンバ変数に「power」を宣言
    private boolean power = false;

    // クラス内の2つのメソッドから、メンバ変数を参照、更新できる。

    public boolean getPower() {
        return this.power;
    }

    public void setPower(boolean power){
        this.power = power;
    }
}
