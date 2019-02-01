package _12_zadanie_petle_tablice;

import java.util.HashSet;

public class PorownanieTablic {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 55 };
        int[] b = { 1, 3, 5, 6, 7, 15, 9, 55, 0 };


        for (int element1 : a) {
            for (int i : b) {
                if (i == element1) {
                    System.out.println(i);
                }
            }


        }



        }

    }

