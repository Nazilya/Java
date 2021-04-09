package intellijidea;

public class HomeworkApp {
    public static void main(String[] args) {
        PrintTreeWords();
        checkSumSign();
        compareNumbers();
        printColor();
    }

    public static void PrintTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a > b) {
            System.out.println("Больше");
        }
        else {
            System.out.println("Меньше");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
        System.out.println("Проверка завершена");
        }
    }
