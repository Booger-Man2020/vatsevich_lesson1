import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        checkSum();
        inter(15);
        positivNumber(-15);
        stringsNumbers();
        System.out.println(leapYear(2020));
        System.out.println(leapYear1());


    }


    private static void checkSum() {
        System.out.println("Задача 1");
        System.out.println("Введи число а");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введи число d");
        int d = scan.nextInt();
        boolean sum = (a + d > 10 && a + d < 20);
        System.out.println(sum);
    }

    public static void inter(int a) {
        System.out.println("Задача 2");
        if (a >= 0) {
            System.out.println("число положительое");
        } else System.out.println("число отрицательое");

    }

    public static void positivNumber(int number) {
        System.out.println("Задача 3");
        boolean b = (number >= 0);
        System.out.println(b);
    }

    public static void stringsNumbers() {
        System.out.println("Задача 4");
        System.out.println("Введи число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String text = "Hello";
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 >= 0 || (year % 100 >= 0 || year % 4 >= 0)) {
        }
        return true;
    }

    public static boolean leapYear1() {
        System.out.println("Задача 5 ");
        System.out.println("Определи високосный год или нет");
        System.out.println("Введите год");
        Scanner scan = new Scanner(System.in);
        double year = scan.nextInt();
        int[] matrix = new int[600];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = i * 4;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (year == matrix[i]) {
                boolean b = (matrix[i] == year);
                return b;
            }
        }
        return false;
    }
}



