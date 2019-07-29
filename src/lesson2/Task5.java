package lesson2;



public class Task5 {
    public void randomizeNumbers(int [] array){
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (array[i] * Math.random());
        }
    }

    public int findMax(int [] array){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            maxValue =  (array[i] > maxValue)? array[i] : maxValue;
        }
        return maxValue;
    }

    public int findMin(int [] array){
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            minValue = (array[i] < minValue)? array[i] : minValue;
        }
        return minValue;
    }
}
