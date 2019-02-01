package _11_zadanie_petle;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        Random los = new Random();
        int a = los.nextInt(10);
        int b = los.nextInt(10);
        System.out.println("Sprobuj ponownie: " + a+ "*" + b);
        int proba=1;
        int odpowiedz = wejscie.nextInt();
        int rozwiazanie = a*b;

        while (rozwiazanie!=odpowiedz){
            proba=proba+1;
            System.out.println("Sprobuj ponownie: " + a+ "*" + b);
            int odpowiedz2 = wejscie.nextInt();
            odpowiedz=odpowiedz2;
            //if (odpowiedz == rozwiazanie) ;
           // System.out.println("Udało się! liczba prob " + proba );



        }
        System.out.println("UDAŁO SIĘ! liczba prób:" + proba );
    }

    }

