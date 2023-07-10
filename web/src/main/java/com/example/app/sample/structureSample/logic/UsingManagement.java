package com.example.app.sample.structureSample.logic;

import com.example.app.sample.structureSample.data.sample.ManagementData;
import com.example.app.sample.structureSample.data.sample.UserData;

public class UsingManagement {
    public static void main(String[] args) {
    ManagementData data = new ManagementData();

    data.setActivity(1000);
    data.setSecurity("secure room");

    UserData userData = new UserData();
    userData.setUserName("User ABCDE");
    userData.setPassword("1234rewq");

    data.setUserData(userData);

    System.out.println("data:"
        + "\n\tactivity:" + data.getActivity()
        + "\n\tsecurity:" + data.getSecurity()
        + "\n\tuserData:"
        + "\n\t\tuserName:" + data.getUserData().getUserName()
        + "\n\t\tpassword:" + data.getUserData().getPassword()
        );
    }
}
