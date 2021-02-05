package com.company;
//Работу кода разбирал, чтобы это было видно, делал коментарии
//не разобрался с проверкой победы и ходы компьютера не переделал
//от вашего кода практически ничем этот код не отличается, только добавил нумирацию по горизонтале и вертикале как в методичке.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;//переменная для поля(сиволы)
    public static final int SIZE = 5; //Вертикаль (построение поля)
//    public static final int DOTS_TO_WIN = 5; //Горизонталь
    public static final int DOTS_TO_WIN = SIZE;//Горизонталь (построение поля)

    public static final char DOT_EMPTY = '•';//точка на поле
    public static final char DOT_X = 'X';//символ на поле
    public static final char DOT_O = 'O';//символ на поле

    public static Scanner scanner = new Scanner(System.in); //считываем значения с консоли

    public static void main(String[] args) {
        initMap();//вызов метода инициализирующего игровое поле
        printMap();//вызов метода выводящего и нумерующего, по вертикале и горизонтале, игровое поле
        boolean humanWin;
        boolean aiWin = false;
        do {
            humanTurn();//ход человека (ввод координат)
            printMap(); //вызов метода выводящего игровое поле уже с ходом человека
            humanWin = checkWin(DOT_X);
            if (humanWin) {
                break;
            }
            aiTurn();//ход компьютера (ввод координат)
            printMap();//вызов метода выводящего игровое поле уже с ходом компьютера
            aiWin = checkWin(DOT_O);
            if (aiWin) {
                break;
            }
        } while (!mapIsFull());
        if (humanWin) {
            System.out.println("Победил человек");
        }
        if (aiWin) {
            System.out.println("Победил компьютер");
        }
        if (!humanWin && !aiWin) {
            System.out.println("Ничья");
        }
    }

    //проверка победы (честно не разобрался в этом методе)
    //понимаю, что сверяются именно символы, но не понимаю нужно ли
    //что-то менять чтобы проводилась проверка на поле 5х5,
    //я считаю что достаточно указать поле 5х5 (задать переменной SIZE значение 5)
    private static boolean checkWin(char symbol) {
        //что в строке есть нужное количество символов подряд
        for (char[] row : map) {
            int quantitySymbolInRow = 0;
            for (int i = 0; i < SIZE; i++) {
                if (row[i] == symbol) {
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        //что в столбце есть нужное количество символов подряд
        for (int i = 0; i < SIZE; i++) {
            int quantitySymbolInRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol) {
                    quantitySymbolInRow++;
                } else if (quantitySymbolInRow > 0) {
                    quantitySymbolInRow = 0;
                }
                if (quantitySymbolInRow == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        //что в диагоналях есть нужное количество символов подряд
        int quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }
        quantitySymbolInRow = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE-i-1] == symbol) {
                quantitySymbolInRow++;
            } else if (quantitySymbolInRow > 0) {
                quantitySymbolInRow = 0;
            }
            if (quantitySymbolInRow == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean mapIsFull() { //заполняем поле точками
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {//ввод координат компьютером
        int x, y;
        do {
            x = new Random().nextInt(SIZE);
            y = new Random().nextInt(SIZE);
        } while (!isCellValid(x, y));//метод проверяющий возможность установки введенных пораметров
        map[x][y] = DOT_O;//запись введенных координат в поле
    }

    private static void humanTurn() {//ввод координат человеком
        int x, y;
        do {//вывод на консоль
            System.out.println("Введите координаты");
            System.out.println("Введите X (вертикаль)");
            x = scanner.nextInt() - 1;// уменьшение введенного Х координата на один
            // так как счет массива при инициализации игрового поля начинается с 0
            System.out.println("Введите Y (горизонталь");
            y = scanner.nextInt() - 1;// уменьшение введенного Y координата на один
            // так как счет массива при инициализации игрового поля начинается с 0
        }
        while (!isCellValid(x, y));//метод проверяющий возможность установки введенных пораметров
        map[x][y] = DOT_X; //запись введенных координат в поле
    }

    //метод проверяющий возможность установки введенных пораметров
    private static boolean isCellValid(int x, int y) {//true если условие валидно, т.е. мы можем поставить символ в эту ячейку, false в иных случаях
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && map[x][y] == DOT_EMPTY;
    }

    //вывод инициализированного поля в консоль
    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {//нумеруем горизонталь поля
            System.out.print(i + " ");//вывод нумерации в строку
        }
        System.out.println();//красная строка после нумерации поля по горизонтале
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " "); //нумерация по вертикали
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");// вывод игрового поля
            }
            System.out.println();//красная строка (каждый ряд с красной страки)
        }
        System.out.println();//пустая строка (отступ)

//        for (int i = 0; i < SIZE; i++) { // Код преподователя
//            System.out.println();
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//        }
//        System.out.println();
    }

    private static void initMap() {//инициализация поля
//        map = new char[SIZE][SIZE];//инициализируем массив двумя цыклами
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                map[i][j] = DOT_EMPTY;// заполнение поля символами(точками)
//            }
//        }
        map = new char[SIZE][SIZE]; //Код преподователя
        for (char[] row : map) {
            Arrays.fill(row, DOT_EMPTY);// заполнение поля символами(точками)
        }
    }
}
