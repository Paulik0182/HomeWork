package com.lesson6;

public class Cat extends Animal {
    protected String color;
    private final int catMaxRunMeter;// максимальное расстояние которое может пробежать кот.

    {
        catMaxRunMeter = 200;
    }

    private final int catMaxSwimMeter;// максимальное расстояние которое может проплыть кот (коты не плавают).

    {
        catMaxSwimMeter = 0;
    }

    private static int catCount = 0;

    public Cat(String name, int age, String color, int runMeter, int swinMeter) {
        super();
        catCount++;
        this.name = name;
        this.age = age;
        this.runMeter = runMeter;
        this.swimMeter = swinMeter;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Животное (Cat): " + name + ", Цвет: " + color + ", Возраст: " + age + " л.");

    }

    @Override
        // анатация, не обязательная, проверяет лишь действительно ли есть
        //в родительном классе такой метод который собираемся переопределить.
    void run() {
        if (runMeter >= catMaxRunMeter || runMeter <= 0) {
            System.out.println("!! У кота " + name + " не верно указано растояние которое он " +
                    "пробежал (" + runMeter + " м.), укажите правильное растояние.!!");
        } else System.out.println("Кот: " + name + " - " + runMeter + " м.");
    }

    @Override
    void swim() {
        if (swimMeter >= catMaxSwimMeter + 1 || swimMeter <= catMaxSwimMeter - 1) {
            System.out.println("Коты не плавают. Кот " + name + " в шоке, куда смотрит судья, " +
                    "ему написали, что он проплыл (" + swimMeter + " м.).");
        }
        if (swimMeter == catMaxSwimMeter) {
            System.out.println("Кот: " + name + " - " + swimMeter + " м. (коты не плавают).");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}
