package lesson2;

public class Task3 {
    public void selectiveMultiply(int [] array){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < 6) array[i] *=2;
        }
    }
}
