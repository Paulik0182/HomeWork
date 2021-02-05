package com.company;

/*Этот код запускается в классе Main.
Если раскомментировать строку 8 и закомментить строку 9, можно запустить непосредственно этот класс (код).
 */
public class Exercise4 {

    //public static void main(String[] args) {
    public void resolved4() {
        int a = 8, b = 11;
        System.out.println("ЗАДАНИЕ 4. проверка целых чисел, лежит ли их сумма в пределах от 10 до 20 включительно. " +
                "Да - true, нет - false.");
        System.out.println("Введенные числа: " + a + " и " + b + ". Результат: " + amount(a, b));
        System.out.println("----------------------"); //пустая строка.
    }

    public static boolean amount(int a, int b) {

        int c = a + b;
        if (10 <= c && 20 >= c) {
            return true;
        }
        return false;
    }
}
// return 10 <= c && 20 >= c; можно и так