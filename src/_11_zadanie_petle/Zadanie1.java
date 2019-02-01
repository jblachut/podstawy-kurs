package _11_zadanie_petle;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        char gwiazdka = '*';
        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj wysokość choinki: ");
        int poziomy = wejscie.nextInt();

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(gwiazdka);
                }
            }
            System.out.println();
        }
    }
}

