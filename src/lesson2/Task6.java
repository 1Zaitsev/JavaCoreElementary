package lesson2;

import java.util.Arrays;

public class Task6 {
    public boolean checkBalance(int[] array) {
        boolean result = false;

        int left = 0;
        int right = 0;

        if (array.length > 1) {
            for (int i = 0; i < array.length / 2; i++) {
                left += array[i];
                right += array[array.length - i - 1];

                if (i == (array.length / 2 - 1) && array.length % 2 != 0) {
                    right += array[array.length - i - 2];
                }
            }
            if (left < right) {
                for (int i = array.length / 2; i < array.length; i++) {
                    left += array[i];
                    right -= array[i];

                    if (left == right) {
                        result = true;
                        break;
                    }

                }
            } else if (left > right) {
                for (int i = array.length / 2; i < array.length; i++) {
                    left -= array[i];
                    right += array[i];

                    if (left == right) {
                        result = true;
                        break;
                    }
                }
            } else {
                result = true;
            }
        } else {
            System.out.println("Слишком короткий массив");
        }
        return result;
    }
}