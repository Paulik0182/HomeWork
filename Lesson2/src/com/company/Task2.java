package com.company;

/*
2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c += 3;

            System.out.print(a[i] + " ");
        }
    }
}
