package com.lesson6;

public class Dog extends Animal {
    protected int weight;
    private final int dogMaxRunMeter;// максимальное расстояние которое может пробежать собака.

    {
        dogMaxRunMeter = 500;
    }

    private final int dogMaxSwimMeter;// максимальное расстояние которое может проплыть собака.

    {
        dogMaxSwimMeter = 10;
    }

    private static int dogCount = 0;

    public Dog(String name, int age, int weight, int runMeter, int swinMeter) {
        super();
        dogCount++;
        this.name = name;
        this.age = age;
        this.runMeter = runMeter;
        this.swimMeter = swinMeter;
        this.weight = weight; //вес

    }

    public void dogInfo() {
        System.out.println("Животное (Dog): " + name + ", Вес: " + weight + "кг., Возраст: " + age + " л.");

    }

    @Override
// анатация, не обязательная, проверяет лишь действительно ли есть
        //в родительном классе такой метод который собираемся переопределить.
    void run() {
        if (runMeter >= dogMaxRunMeter || runMeter <= 0) {
            System.out.println("!! У пса " + name + " не верно указано растояние которое он " +
                    "пробежал (" + runMeter + " м.), укажите правильное растояние.!!");
        } else System.out.println("Пес: " + name + " - " + runMeter + " м.");
    }

    @Override
    void swim() {
        if (swimMeter >= dogMaxSwimMeter || swimMeter <= 0) {
            System.out.println("!! У пса " + name + " не верно указано растояние которое он " +
                    "проплыл (" + swimMeter + " м.), укажите правильное растояние.!!");
        } else System.out.println("Пес: " + name + " - " + swimMeter + " м.");
    }

    public static int getDogCount() {
        return dogCount;
    }
}
