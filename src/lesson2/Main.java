package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Task 1 (lines 8 - 15)
        Task1 task1 = new Task1();
        int[] arr1 = task1.creatArray(10, 1);
        System.out.println("Task1 result: \nМассив до преобразования:    " + Arrays.toString(arr1));
        task1.invertArray(arr1);
        System.out.println("Массив после преобразования: " + Arrays.toString(arr1) + "\n________________________");

//Task2 (lines 16-21)
        Task2 task2 = new Task2();
        int[] arr2 = new int[8];
        System.out.println("Task2 result: \nСоздание массива:               " + Arrays.toString(arr2));
        task2.feelInWithStep3(arr2);
        System.out.println("Заполнение массива с шагом = 3: " + Arrays.toString(arr2) + "\n________________________");

//Task3 (lines 23-29)
        Task3 task3 = new Task3();
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task3 result: \nСоздание массива:            " + Arrays.toString(arr3));
        task3.selectiveMultiply(arr3);
        System.out.println("Массив после преобразования: " + Arrays.toString(arr3) + "\n________________________");

//Task4 (lines 29 - 34)
        Task4 task4 = new Task4();
        int[][] arr4 = task4.create2Darray(5);
        task4.feelInDiagonals(arr4);
        System.out.println("Task4 result: \n ");
        task4.print2Darray(arr4);
        System.out.println("________________________");

//Task5 (lines 37-43)
        Task5 task5 = new Task5();
        int[] arr5 = task1.creatArray(40, 100);
        task5.randomizeNumbers(arr5);
        System.out.println("Task5 result: \nСоздание массива: " + Arrays.toString(arr5));
        System.out.println("Максимальное значение в массиве: " + task5.findMax(arr5));
        System.out.println("Минимальное значение в массиве: " + task5.findMin(arr5));
        System.out.println("________________________");

//Task 6 (lines 46 - 51)
        Task6 task6 = new Task6();
        int[] arr6 = task1.creatArray(5, 3);
        System.out.println("Task6 result: \nСоздание массива: " + Arrays.toString(arr6));
        boolean result = task6.checkBalance(arr6);
        System.out.println("Результат проверки массива на наличие точки баланса: " + result + "\n________________________");
    }
}