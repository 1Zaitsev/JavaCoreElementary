package lesson2;

public class Task1 {
    public int[] creatArray(int size, int max) {
        int[] array = new int[size];

        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random() * (max+1));
        }
        return array;
    }

    public void invertArray(int[] array){
        for(int i = 0; i<array.length; i++){
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}
