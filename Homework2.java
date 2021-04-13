package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        zadacha1();
    }
    public static void zadacha1() {
        int a = 10;
        int b = 25;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void zadacha2() {
        int a = -4;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void zadacha3() {
        int a = 4;
        if (a >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void zadacha4() {
        String str = "Hellow, friends";
        int i = 1;
        while (i <= 5) {
            System.out.println(str);
            i +=1;
        }
    }
}
