package com.lesson6;

public class Animal {

    protected String name;
    protected int age;
    protected int runMeter;// бег
    protected int swimMeter;//плыть

    public Animal() {
    }

    void run() {
        System.out.println("Животные пробежали:");
    }

    void swim() {
        System.out.println("Животные проплыли:");
    }
}
