package com.lesson3;

import java.util.Random;
import java.util.Scanner;

/*
1. Написать программу, которая загадывает случайное число от 0 до 9 и
пользователю дается 3 попытки угадать это число. При каждой попытке
компьютер должен сообщить, больше ли указанное пользователем число,
чем загаданное, или меньше. После победы или проигрыша выводится запрос –
«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int a = rand.nextInt(10);
    public static byte attempt = 3; //число попыток

    public static void main(String[] args) {

        getForward();
    }

    private static void getForward() {
        for (int i = 0; i < attempt; i++) {
            int d = getNumberFromScanner("Введите число от 0 до 9. Количество попыток: " + (attempt - i), 0, 10);
            if (d == a) {
                System.out.println("Вы угадали, это действительно число: " + a);
                break;
            } else if (a > d) {
                System.out.println("Вы ввели слишком маленькое число");
            } else {
                System.out.println("Вы ввели слишком большое число");
            }
            if (i == (attempt - 1)) {
                System.out.println("Вы проиграли");
                getContinuation();
            }
        }
    }

    public static void getContinuation() {
        int x;
        do {
            System.out.println("Продолжим играть? Если ДА нажмите 1, НЕТ нажмите 0");
            x = sc.nextInt();
            if (x == 1) {
                getForward();
            } else if (x == 0) {
                System.out.println("Игра окончена");
                break;
            } else {
                getContinuation();
            }
        } while (x == 0);
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);//ввод данных в пределах от 0 до 10
        return x;
    }
}