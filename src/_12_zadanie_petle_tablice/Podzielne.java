package _12_zadanie_petle_tablice;

import java.util.Scanner;

public class Podzielne {

    public static void main(String[] args) {

        int index = 0;
        int[] tablica = new int[5];


        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj 5 liczb");
        System.out.println("podaj 1 liczbe");
        tablica[index] = wejscie.nextInt();

        index++;

        int cykl = index + 1;


        while (index < 5) {
            System.out.println("podaj " + cykl + " liczbe");
            tablica[index] = wejscie.nextInt();
            index++;
            cykl++;
            //System.out.println("Czy wprowadzić kolejną liczbę? T/N");
            //String word = wejscie.next();
            // word = word.toUpperCase();
            // end = word.charAt(0);


        }
        System.out.println("Podaj liczbę porównawczą");
        int porownanie = wejscie.nextInt();


        System.out.println("Liczby podzielne przez : " + porownanie);
        for (int i1 : tablica) {
            if (i1 % porownanie == 0) {
                System.out.println(i1);
            }
        }

        System.out.println("Pierwsza podzielna przez liczbę " + porownanie);
        for (int i = 0; i < tablica.length; i++) {
            {
                if (tablica[i] % porownanie == 0) {
                    System.out.println("Odnaleziono element " + tablica[i] + " pod indeksem " + i + " jako pierwsza pozycja większa od " + porownanie);
                    return;
                }


            }
        }
    }
}