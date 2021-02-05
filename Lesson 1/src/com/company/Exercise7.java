package com.company;

import java.util.Scanner;

/*Этот код запускается в классе Main.
Если раскомментировать строку 10 и закомментировать строку 11, можно запустить непосредственно этот класс (код).
 */
public class Exercise7 {

    //   public static void main(String[] arge) {
    public void resolved7() {
        System.out.println("ЗАДАНИЕ 7. приветствие.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя : ");
        String name = sc.nextLine();

        System.out.println("Привет, " + name + "!");
        System.out.println("----------------------"); //пустая строка.
    }
}