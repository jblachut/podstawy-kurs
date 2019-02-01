package _11_zadanie_petle;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        Random los = new Random();
        int a = los.nextInt(999);
        System.out.println("Jaką liczbę wylosowałem?");
        int proba=1;
        int odpowiedz = wejscie.nextInt();

        while (a!=odpowiedz){
            proba=proba+1;
            if(a>odpowiedz){
                System.out.println("Sprobuj ponownie, podana liczba jest większa" );
                System.out.println("Podaj liczbę");
                int odpowiedz2 = wejscie.nextInt();
                odpowiedz=odpowiedz2;
            }
            else {
                System.out.println("Sprobuj ponownie, podana liczba jest mniejsza" );
                System.out.println("Podaj liczbę");
                int odpowiedz2 = wejscie.nextInt();
                odpowiedz=odpowiedz2;

            }





        }
        System.out.println("UDAŁO SIĘ! liczba prób:" + proba );
    }

}

