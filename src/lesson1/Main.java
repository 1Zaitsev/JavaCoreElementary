package lesson1;

public class Main {
    public static void main(String[] args) { // Task1
        //Task 2 (lines 6 - 17)
        byte a = 100;
        short b = 2000;
        int c = 3000;
        long d = 4444000L;
        char e = '\u0950';

        float f = 5.555555f;
        double g = 66666.666666;

        boolean h = true;

        String i = "Hello, Java!";


        System.out.println("Task1 result: \n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n" + i + "\n_______________");

        System.out.println("Task3 result: " + task3(1, 0, 5, 2) + "\n_______________");

        System.out.println("Task4 result: " + task4(50, -40) + "\n_______________");

        System.out.println("Task 5 result:");
        task5(5);
        task5(-700);
        System.out.println("_______________");

        System.out.println("Task 6 result: " + task6(-18) + "\n_______________");

        System.out.println("Task 7 result:");
        task7("Igor");
        System.out.println("_______________");

        System.out.println("Task 8 result:");
        task8(-15);
        task8(1999);
        task8(2020);
        System.out.println("_______________");

        System.out.println("Task 9 result:");
        System.out.println("void myMethod(int i, String b) {}");
        System.out.println("void myMethod(String b, int i) {}");
        System.out.println("Две разные сигнатуры одного метода");

    }

    static double task3(int a, int b, int c, int d) {
        return a * (b + ((float) c / d));
    }

    static boolean task4(int a, int b) {
        boolean result = false;
        if ((a + b) >= 10 && (a + b) <= 20) {
            result = true;
        }
        return result;
    }

    static void task5(int i) {
        if (i >= 0) {
            System.out.println(i + " полижительное число");
        } else {
            System.out.println(i + " отрицательное число");
        }
    }

    static boolean task6(int i) {
        return i < 0;
    }

    static void task7(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void task8(int year) {
        if (year <= 0) {
            System.err.println("Указан некорректный год");
        } else {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год не високосный");
            }
        }
    }
}
