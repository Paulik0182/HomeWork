package com.company;

public class Exercise2 {
//static необходим так-как вывод на консоль происходит в статическом методе, а переменные объявлены в самом классе.
//Если переменные объявить в методе, static не нужен.

    static byte a = 100;
    static short s = 30_000;
    static int uni = 40_000_000;
    static long longVar = 50_000_000_000L;
    static float f = 65326546235467576354763f; //В данной переменной при привышении некого значения
    // она начинает обрезать значения (возводить в степень),
    // то есть, данная переменная не является точной.
    static double d = 40.456;
    static char c = 'g';
    static boolean b = false;

    public void resolved2() {
        System.out.println("ЗАДАНИЕ 2. Создание примитивных переменных и инициализация их.");
        System.out.println(a + " тип переменной - byte");
        System.out.println(s+ " тип переменной - short");
        System.out.println(uni+ " тип переменной - int");
        System.out.println(longVar+ " тип переменной - long");
        System.out.println(f +" В данной переменной float при привышении некого значения, " +
                "значение обрезается (возводится в степень), то есть, данная переменная не является точной.");
        System.out.println(d+ " тип переменной - double");
        System.out.println(c+ " тип переменной - char");
        System.out.println(b+ " тип переменной - boolean");
        System.out.println("----------------------"); //пустая строка.

    }
}
