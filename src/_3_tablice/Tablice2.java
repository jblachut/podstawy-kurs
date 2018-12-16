package _3_tablice;
import java.util.Random;

public class Tablice2 {
    public static void main(String[] args) {
        int[][] tablica2d = new int [4][4];
        Random r = new Random();

        for(int i = 0; i < tablica2d.length; i++) {
            for(int j = 0; j < tablica2d[i].length; j++){
                tablica2d[i][j]=r.nextInt(101);
                System.out.print(" " + tablica2d[i][j]);



            }
            System.out.println("");
        }

    }

}
