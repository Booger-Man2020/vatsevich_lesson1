import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask(5, 8);
        sixTask();
    }

    public static void firstTask() {
        System.out.println("firstTask");
        int[] arra = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] == 0) {
                arra[i] = 1;
            } else arra[i] = 0;
            System.out.println(arra[i] + " ");
        }
    }


    public static void secondTask() {
        System.out.println("secondTask");
        int[] massive = new int[100];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
            System.out.print(massive[i] + " ");
            System.out.println(" ");
        }

    }

    public static void thirdTask() {
        System.out.println("thirdTask");
        int[] arra = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] < 6) {
                arra[i] = arra[i] * 2;
            }
            System.out.println(arra[i]);
        }
    }


    public static void fourthTask() {
        System.out.println("fourthTask");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void fifthTask(int len, int initialValue) {
        int[][] arr = new int[len][len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = initialValue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void sixTask() {
        int max, min;
        int[] arr = new int[]{9, 5, 3, 4, 1, 6, 7, 8, 2};
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        System.out.println(max);
        min = arr[0];
        System.out.println(min);

    }

}


