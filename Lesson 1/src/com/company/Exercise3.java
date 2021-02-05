package com.company;

/*Этот код запускается в классе Main.
Если раскомментировать строку 10 и закомментировать строку 11, можно запустить непосредственно этот класс (код).

пример инициализации переменных и возврата результата (строка 13) можно посмотреть в Exercise4 (строка 10 и 13) и
в Exercise6 (строка 15 и 16).
 */
public class Exercise3 {
    //public static void main(String[] args) {
    public void resolved3() {
        System.out.println("ЗАДАНИЕ 3. метод вычисляющий выражение a * (b + c / d), тип аргументов float.");
        System.out.println("2 умноженное на (5 + 6 / 2): равняется " + calculate(2, 5, 6, 2));
        System.out.println("----------------------"); //пустая строка.
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + c / d);
    }
}
