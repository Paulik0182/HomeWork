package com.company;

import java.util.Scanner;

/*Этот код запускается в классе Main.
Если раскомментировать строку 9 и закомментировать строку 10, можно запустить непосредственно этот класс (код).
 */
public class Exercise8 {
    // public static void main(String[] args) {
    public void resolved8() {
        System.out.println("ЗАДАНИЕ 8*. вычисление високосного года.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = sc.nextInt();
        if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0) {
            System.out.println(a + "г. - обычный год, не високосный.");
        } else {
            System.out.println(a + " високосный год.");
        }
    }
}