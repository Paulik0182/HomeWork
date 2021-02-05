package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*  НЕ РАЗОБРАЛСЯ. массивы очень тяжело даются, даже с помощью интернета никак.
 7.**** Написать метод, которому на вход подается одномерный массив и число n
 (может быть положительным, или отрицательным), при этом метод должен сместить
 все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
 задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при
 n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
 [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] c = {3, 5, 6, 1};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("На сколько позиций Вы хотите сместить элементы в массиве : ");
//        int n = sc.nextInt();
        int n = 1;
        int[] result = new int[a.length + n];

        for (int i = 0; i < a.length; i++) {      //строка для того что бы вывести начальные элементы.
            System.out.print(a[i] + " ");           //строка для того что бы вывести начальное значение.
        }
        System.out.println("Начальное значение."); //строка для того что бы вывести начальное значение.
        for (int i = 0; i < a.length; i++) {
            result[i + n] = a[i];
            a[i] = result[i];
            a[0]=3; //это просто магия.) !!!!!!!!!
        }
//        Arrays.setAll(b, (int i) -> a[(i+n)%a.length]);
//        System.out.println("a="+Arrays.toString(a));
//        System.out.println("b="+Arrays.toString(b));
        for (int i : a) {
            System.out.print(i + " ");

//        for (int i = 0; i < a.length; i++) {
//            a[i] = a[(i + n) % a.length];
//            System.out.print(a[i] + " ");
//        }
        }
    }
}
