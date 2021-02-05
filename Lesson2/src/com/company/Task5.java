package com.company;

/*
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
 */
public class Task5 {
    public static void main(String[] args) {
        int[] a = {4, -5, 3, 2, 11, 3, 74, 7, 1, 18, 39, 21, 77, 45};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");        //строка для того что бы вывести начальное значение.
        }
        System.out.println("Заданный массив."); //строка для того что бы вывести начальное значение.

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int position = i;

            for (int j = i; j < a.length; j++)
                if (min > a[j]) {
                    position = j;
                    min = a[j];
                }
            int temp = a[i];
            a[i] = a[position];
            a[position] = temp;
        }
        System.out.println("\n" + (short) a[0] + " Минимальное значение в массиве.");

        System.out.println((short) a[a.length - 1] + " Максимальное значение массива.");
    }
}
