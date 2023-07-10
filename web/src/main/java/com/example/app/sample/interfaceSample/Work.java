package com.example.app.sample.interfaceSample;

public class Work implements Job {

    public void whoProgram() {
        System.out.println( programer + "は、");
    }

    public void whoPlay() {
        System.out.println( musician + "は、");
    }

    public void program() {
        System.out.println("システム開発をします");
    }

    public void play(String instrument) {
        System.out.println(instrument + "を演奏します");
    }
}
