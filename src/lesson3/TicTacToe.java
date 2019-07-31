package lesson3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    /*
    Блок настроек игры
     */
    private static char[][] map; // матрица игры
    private static final int SIZE = 3; // размерность поля

    private static final char DOT_EMPTY = '+'; //пустой символ - свободное поле
    private static final char DOT_X = 'X'; //крестик - сивол игрока
    private static final char DOT_O = 'O'; //нолик - сивол символ компьютера

    private static final boolean SILLY_MODE = true;
    private static int mod; // уровень сложности;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        setMod();

        initMap();
        printMap();

        while(true){
            humanTurn();                    //ход человека
            if(isEndGame(DOT_X)) break;
            computerTurn();                  //ход компьютера
            if(isEndGame(DOT_O)) break;
        }
        System.out.println("The end!");
    }

    /**
    *Метод подготовки игрового поля
     */
    private static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * Метод вывода поля на экран
     */
    private static void printMap(){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Ход игрока
     */
    private static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        }while(!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    /**
     * Ход компьютера
     */
    private static void computerTurn() {
        int x = -1;
        int y = -1;

        switch (mod) {
            case 1:
                do {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                } while (!isCellValid(x, y));

                System.out.println("Компьютер выбрал ячейку: " + (y + 1) + " " + (x + 1));
                map[y][x] = DOT_O;
                break;
            case 2:
                boolean moveFound = false;
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == DOT_EMPTY) {
                            //Проверка по направлениям
                            //лево верх
                            if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("LU");
                            }
                            //верх
                            else if (i - 1 >= 0 && map[i - 1][j] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("U");
                            }
                            //право верх
                            else if (i - 1 >= 0 && j + 1 <SIZE && map[i - 1][j + 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("UR");
                            }
                            //лево
                            else if (j - 1 >= 0 && map[i][j - 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("L");
                            }
                            //право
                            else if (j + 1 < SIZE && map[i][j + 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("R");
                            }
                            //лево низ
                            else if (i + 1 < SIZE && j - 1 >= 0 && map[i + 1][j - 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("LD");
                            }
                            //низ
                            else if (i + 1 < SIZE && map[i + 1][j] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("D");
                            }
                            //право низ
                            else if (i + 1 < SIZE && j + 1 < SIZE && map[i + 1][j + 1] == DOT_O) {
                                x = j;
                                y = i;
                                moveFound = true;
                                System.out.println("DR");
                            }
                        }
                        if (moveFound) break;
                    }
                    if (moveFound) break;
                }
                if(x == -1){
                    do {
                        x = random.nextInt(SIZE);
                        y = random.nextInt(SIZE);
                    } while (!isCellValid(x, y));
                    System.out.println("Random");
                }

                System.out.println("Компьютер выбрал ячейку: " + (y + 1) + " " + (x + 1));
                map[y][x] = DOT_O;

            case 3:
                int maxX = -1;
                int maxY = -1;
                int maxScore = 0;

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == DOT_EMPTY) {
                            int fieldScore = 0;
                            //Проверка по направлениям
                            //лево верх
                            if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] == DOT_O) {
                                fieldScore++;
                            }
                            //верх
                            if (i - 1 >= 0 && map[i - 1][j] == DOT_O) {
                                fieldScore++;
                            }
                            //право верх
                            if (i - 1 >= 0 && j + 1 < SIZE && map[i - 1][j + 1] == DOT_O) {
                                fieldScore++;
                            }
                            //лево
                            if (j - 1 >= 0 && map[i][j - 1] == DOT_O) {
                                fieldScore++;
                            }
                            //право
                            if (j + 1 < SIZE && map[i][j + 1] == DOT_O) {
                                fieldScore++;
                            }
                            //лево низ
                            if (i + 1 < SIZE && j - 1 >= 0 && map[i + 1][j - 1] == DOT_O) {
                                fieldScore++;
                            }
                            //низ
                            if (i + 1 < SIZE && map[i + 1][j] == DOT_O) {
                                fieldScore++;
                            }
                            //право низ
                            if (i + 1 < SIZE && j + 1 < SIZE && map[i + 1][j + 1] == DOT_O) {
                                fieldScore++;
                            }
                            if (fieldScore > maxScore){
                                maxScore = fieldScore;
                                maxX = j;
                                maxY = i;
                            }
                        }
                    }
                }
                if(maxX != -1){
                    x = maxX;
                    y = maxY;
                }
                if(x == -1){
                    do {
                        x = random.nextInt(SIZE);
                        y = random.nextInt(SIZE);
                    } while (!isCellValid(x, y));
                    System.out.println("Random");
                }

                System.out.println("Компьютер выбрал ячейку: " + (y + 1) + " " + (x + 1));
                map[y][x] = DOT_O;

        }
    }

    /**
     * Метод валидации запрашиваемой ячейки на кооректность
     * @param x - координата по горизонтали
     * @param y - координата по вертикали
     * @return boolean - признак валидности
     */
    private static boolean isCellValid(int x, int y){
        boolean result = true;

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            result = false;
        } else if (map[y][x] != DOT_EMPTY) {
            result = false;
        }

        return result;
    }


    /**
     * Метод проверки завершения игры
     * @param playerSymbol - символ текущего игрока
     * @return boolean - признак завершения игры
     */
    private static boolean isEndGame(char playerSymbol){
        boolean result = false;

        printMap();
        //проверка необходимости следующего хода
        if(checkWin(playerSymbol)){
            System.out.println("Победили " + playerSymbol);
            result = true;
        }else if(isMapFull()){
            System.out.println("Ничья");
            result = true;
        }

        return result;
    }

    /**
     * Проверка полного заполнения поля
     * @return boolean признак оптимальности
     */
    private static boolean isMapFull(){
        boolean result = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY){
                    result = false;
                    break;
                }
            }
            if(!result) break;
        }
        return result;
    }

    /**
     * Метод проверки выигрыша
     * @param playerSymbol - символ текущего игрока
     * @return boolean - результат проверки
     */
    private static boolean checkWin(char playerSymbol){
        boolean result = false;

        if(checkWinDiagonals(playerSymbol) || checkWinLines(playerSymbol)){
            result = true;
        }
        return result;
    }

    /**
     * Проверка выигрышных комбинаций на диагоналях
     * @param playerSymbol - символ игрока
     * @return - признак победы
     */
    public static boolean checkWinDiagonals(char playerSymbol){
        boolean leftRigth = true;
        boolean rightLeft = true;
        boolean result = false;

        for (int i = 0; i < SIZE; i++) {
            leftRigth &= (map[i][i] == playerSymbol);
            rightLeft &= (map[SIZE - i - 1][i] == playerSymbol);
        }
        if(leftRigth || rightLeft){
            result = true;
        }

        return result;
    }

    /**
     * Проверка выигрышных комбинаций на диагоналях
     * @param playerSymbol - символ игрока
     * @return - признак победы
     */
    public static boolean checkWinLines(char playerSymbol){
        boolean cols = true;
        boolean rows = true;
        boolean result = false;

        for (int col = 0; col < SIZE ; col++) {
            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == playerSymbol);
                rows &= (map[row][col] == playerSymbol);
                }
                if (cols || rows) {
                    result = true;
                    break;
                }
            if (result) break;
        }
        return result;
    }

    /**
     * Метод выбора уровня сложности
     */
    public static void setMod(){
        System.out.println("Для выбора уровня сложности введите число от 1 до 3 \n 1 - приметивный\n 2 - лёгкий \n 3 - средний \n-->");
        do{
            mod = scanner.nextInt();
            if(mod <1 || mod >3){
                System.err.println("Некорректно введен уровень сложности. Укажите число от 1 до 3");
            }
        }while (mod<1 || mod>3);
        System.out.println("Вы выбрали " + mod + " уровень сложности\n");
    }
}
