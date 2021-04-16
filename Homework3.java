package lesson3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        //array1();
        //array2();
        //array3();
        //array4();
        //array5_1(15, 8);
        //array5_2(15, "hello");
        array6();
    }

    public static void array1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void array2() {
        int[] arr = new int[101];
        for (int i = 0; i < 101; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    public static void array3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void array4() {
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }
    }


    public static void array5_1(int len, int initialValue) {
        int[] arr = new int[len];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }

    }

    public static void array5_2(int len, String initialValue) {
        String[] arr = new String[len];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }
    }

    public static void array6() {
        int[] arr = {1, 5, 8, 0, 9, 48, 2, 3, 15};
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
          if ( arr[i] > max) {
              max = arr[i];
          }}
            System.out.print(max);
    }
}







