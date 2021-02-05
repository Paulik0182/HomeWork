package com.company;

/* Вариант 2.
1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
условия заменить 0 на 1, 1 на 0;
 */
public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);
        }
        System.out.println();

        //Временная переменная, использоваться при обмене элементов
        int temp;

        for (int i = 0; i < a.length / 2; i++) {
            temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
        }
        //Выводим результат
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
