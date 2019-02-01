package _12_zadanie_petle_tablice;

import java.util.ArrayList;
import java.util.List;

public class PorownywanieTablic2 {
    public static void main(String[] args) {
        List<Integer> wspolne = new ArrayList<>();

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 55 };
        int[] b = { 1, 3, 5, 6, 7, 15, 9, 55, 0 };


        for (int element1 : a) {
            for (int i : b) {
                if (i == element1) {
                    wspolne.add(element1);
                }
            }



        }
        System.out.println(wspolne);


    }

}




