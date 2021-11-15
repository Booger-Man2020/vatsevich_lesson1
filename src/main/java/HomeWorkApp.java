import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printTheeWords();
        chekSumSing();
        printColor();
        compareNumbers();
    }

    public static void printTheeWords() {
        System.out.println("Задача 1: Слова");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSing() {
        System.out.println("Задача 2: Сумма чисел");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
        }

        public static void printColor() {
            System.out.println("Задача 3:  Цвет числа");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
        int value = scanner.nextInt();
        if (value <= 0 ) {
            System.out.println("Красный");
        } else if (value > 100){
            System.out.println("Зеленый");
        } else System.out.println("Желтый");
        }

        public static void compareNumbers(){
            System.out.println("Задача 4: Сравнение чисел");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи чиcло а");
            int a = scanner.nextInt();
            System.out.println("Введи число b");
            int b = scanner.nextInt();
            if ( a >= b){
                System.out.println(" а >= b");
            } else System.out.println("a < b");
        }
    }
