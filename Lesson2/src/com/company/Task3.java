package com.company;

/*
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */
public class Task3 {
    public static void main(String[] args) {

        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < a.length; i++) {      //строка для того что бы вывести начальные элементы.
            System.out.print(a[i] + " ");           //строка для того что бы вывести начальное значение.
        }
        System.out.println("Начальное значение."); //строка для того что бы вывести начальное значение.

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println("Результат.Все числа меньше 6-и умножены на 2.");
    }
}