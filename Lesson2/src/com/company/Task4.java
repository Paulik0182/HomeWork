package com.company;

/*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else a[i][j] = 0;
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
