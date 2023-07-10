package com.example.app.sample.referenceSample.reference;

import com.example.app.sample.referenceSample.reference.data.MyData;

public class ReferenceArraySample {
    public static void main(String[] args) {
        // 配列要素数のみ初期化
        MyData[] dataArray = new MyData[5];

        // 配列内用要素を事前にnull初期化
        MyData inData = null;

        // 配列内要素を初期化
        for (int i = 0; i < dataArray.length; i++) {
            // 要素をオブジェクト化
            inData = new MyData();

            // 要素の各変数を代入
            inData.setNumber(i);
            inData.setName("name" + i);
            inData.setWord("word" + i);

            // 要素を配列インデックス内に仕込む
            dataArray[i] = inData;
        }

        // 配列内要素をコンソール出力
        for (int k = 0; k < dataArray.length; k++) {
            System.out.println(
                    "dataArray[" + k + "]:"
                            + dataArray[k].getNumber() + ", "
                            + dataArray[k].getName() + ", "
                            + dataArray[k].getWord());
        }
    }
}
