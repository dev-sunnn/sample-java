package com.example.app.sample.structureSample.logic;

import com.example.app.sample.structureSample.data.sample.SampleData;

public class UsingStructureSample {
  public static void main(String[] args) {
    SampleData data = new SampleData();

    data.setId(10000);
    data.setName("test name");
    data.setAge(40);
    data.setFlg(true);

    System.out.println("data:"
        + "\n\tid:" + data.getId()
        + "\n\tname:" + data.getName()
        + "\n\tage:" + data.getAge()
        + "\n\tflg:" + data.isFlg()
        );
  }
}
