package com.company;

import java.util.Scanner;

/*Этот код запускается в классе Main.
Если раскомментировать строку 10 и закомментировать строку 11, можно запустить непосредственно этот класс (код).
 */
public class Exercise6 {

    //  public static void main(String[] args) {
    public void resolved6() {
        System.out.println("ЗАДАНИЕ 6. метод возвращает true, если целое число отрицательное, и возвращает false если положительное.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = sc.nextInt();
        System.out.println("Задано число " + a + ". Результат: " + difference(a));
        System.out.println("----------------------"); //пустая строка.

    }

    public static boolean difference(int a) {

        if (0 > a) {
            return true;
        }
        return false;
    }
}
