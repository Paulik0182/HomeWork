package com.company;

import java.util.Scanner;

/*Этот код запускается в классе Main.
Если раскомментировать строку 10 и закомментировать строку 11, можно запустить непосредственно этот класс (код).
 */
public class Exercise5 {

    //  public static void main(String[] args) {
    public void resolved5() {
        System.out.println("ЗАДАНИЕ 5. определение целого числа, положительное ли число или отрицательное.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        int a = sc.nextInt();
        if (0 <= a) {
            System.out.println("Введенное число: " + a + ". Число положительное.");
        } else {
            System.out.println("Введенное число: " + a + ". Число отрицательное.");
        }
        System.out.println("----------------------"); //пустая строка.
    }
}
