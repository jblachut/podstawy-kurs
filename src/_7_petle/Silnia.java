package _7_petle;

import java.util.Scanner;

public class Silnia {

    static long silnia (int n) {
        long wynik = 1;
        for (int x = 2; x <= n; x++) {
            wynik = wynik * x;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner wejscie =new Scanner(System.in);

        while(true) {
            System.out.println("Podaj kolejną liczbę: ");
            int liczba=wejscie.nextInt();
            long wynik = silnia(liczba);
            System.out.println(liczba+ " ! = " +wynik);
        }
    }
}
