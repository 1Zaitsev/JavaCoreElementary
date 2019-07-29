package lesson2;

public class Task4 {
    public int[][] create2Darray (int size){
        int[][] array2D = new int[size][size];
        return array2D;
    }

    public void feelInDiagonals(int[][] array2D){
        for (int i = 0; i < array2D.length; i++){
            array2D[i][i] = 1;
            array2D[i][array2D.length-i-1] = 1;
        }
    }

    public void print2Darray(int[][] array2D){
        for (int i = 0; i < array2D.length ; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
