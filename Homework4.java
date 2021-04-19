package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin0(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Победил искусственный интеллект");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра завершена");
    }

    public static boolean isMapFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (map[row][col] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате x, y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) +" "+ (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin0 (char symb) {
        for (int i = 0; i < SIZE; i++)
            if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb) || (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb && map[4][i] == symb))
                return true;
        if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb && map[4][4] == symb) || (map[4][0] == symb && map[3][1] == symb && map[2][2] == symb && map[1][3] == symb && map[0][4] == symb))
            return true;
        return false;
    }



}
