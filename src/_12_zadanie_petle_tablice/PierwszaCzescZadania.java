package _12_zadanie_petle_tablice;

import java.util.Objects;
import java.util.Scanner;

public class PierwszaCzescZadania {

    public static void main(String[] args) {

        int index = 0;
        int[] tablica = new int[5];
        int end = 'T';
        int max;
        int min;

        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj 5 liczb");
        System.out.println("podaj 1 liczbe");
        tablica[index] = wejscie.nextInt();
        max = tablica[index];
        min = tablica[index];
        index++;

        int cykl = index + 1;


        while (index < 5) {
            System.out.println("podaj " + cykl + " liczbe");
            tablica[index] = wejscie.nextInt();
            if (max < tablica[index]) {
                max = tablica[index];
            }
            if (min > tablica[index]) {
                min = tablica[index];
            }
            index++;
            cykl++;
            //System.out.println("Czy wprowadzić kolejną liczbę? T/N");
            //String word = wejscie.next();
            // word = word.toUpperCase();
            // end = word.charAt(0);


        }

        System.out.println("Podaj liczbę porównawczą");
        int porownanie = wejscie.nextInt();

        int suma = 0;
        for (int i1 : tablica) {
            suma += i1;
        }

        System.out.println("suma wprowadzonych liczb to " + suma);

        int srednia = suma / tablica.length;

        System.out.println("średnia wprowadzonych liczb to " + srednia);
        System.out.println("max wprowadzonych liczb to " + max);

        int roznica = max - min;
        System.out.println("Amplituda wynosi :" + roznica);

        System.out.println("Liczby większe od zadeklarowanej liczby porównawczej:");

        for (int i1 : tablica) {
            if (porownanie < i1) {
                System.out.println(" " + i1);
            }
        }

        System.out.println("Pierwsza liczba większa od zdeklarowanej:");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > porownanie) {
//podaj wynik
                System.out.println("Odnaleziono element " + tablica[i] + " pod indeksem " + i + " jako pierwsza pozycja większa od " + porownanie);
//zakoncz program
                return;
            }
        }



    }
}