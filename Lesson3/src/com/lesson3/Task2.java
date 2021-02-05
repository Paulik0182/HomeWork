package com.lesson3;

import java.util.Random;
import java.util.Scanner;
/*
2. *Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
"broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
"olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}. При запуске программы
компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих
местах. apple – загаданное apricot - ответ игрока ap############# (15 символов, чтобы пользователь не мог
узнать длину слова) Для сравнения двух слов посимвольно можно пользоваться: String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции Играем до тех пор,
пока игрок не отгадает слово. Используем только маленькие буквы.
 */
public class Task2 {
    private static final String[] word = {"apple", "orange", "lemon",
            "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
    public static String temp = generRandom();
    public static String maskTemp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствую!\nКомпьютер загадал слово " +
                "на английском языке.\nПопробуй угадать слово.");

        int tempLen = temp.length();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < (15 - tempLen) + tempLen; i++) {
            st.append("#");
        }
        maskTemp = st.toString();
        System.out.println(maskTemp);

        do {
            System.out.print("Введите букву: ");
            char c = sc.next().charAt(0);
            if (temp.toLowerCase().indexOf(c) >= 0) {
                System.out.println("Что-то есть!");
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) == c) {
                        maskTemp = replaceLetter(Character.toString(c), maskTemp);
                    }
                }
                System.out.println(maskTemp);
            } else {
                System.out.println("Попробуем еще раз!");
            }
        } while (maskTemp.contains("#"));
    }

    private static String replaceLetter(String letter, String maskTemp) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
//            if (temp.charAt(i) == temp.length()) {
//                stringBuilder.append(letter);
//            }
            if (temp.charAt(i) == letter.charAt(0)) {
                stringBuilder.append(letter);
            } else if (maskTemp.charAt(i) != '#') {
                stringBuilder.append(maskTemp.charAt(i));
            } else {
                stringBuilder.append("#");
            }
        }
        return stringBuilder.toString();
    }

    private static String generRandom() {
        Random random = new Random();
        int x = random.nextInt(word.length);
        return word[x];
    }
}
