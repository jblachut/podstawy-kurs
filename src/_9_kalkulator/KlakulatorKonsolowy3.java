package _9_kalkulator;

import java.util.Locale;
import java.util.Scanner;

public class KlakulatorKonsolowy3 {

    public static void main(String[] args) {
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisując napis nie będący liczbą");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        while(true) {
            System.out.print("> ");

            // jeżeli uzytkownik wpisał coś, co nie jest doublem
            if(! wejscie.hasNextDouble()) {
                break; // koniec
            }
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();

                double wynik = oblicz(arg1, arg2, operacja);
                System.out.println("    wynik: " + wynik);
            } catch(Exception e) {              // łapiermy wyjątek tzn wyświetlamy
                System.out.println("Błąd: " + e);  // zobaczymy klasę i message wyjątku
                // System.out.println("Błąd: " + e.getMessage());  // zobaczymy tylko message
            }
        }
        System.out.println("Dziękujemy, papa");
    }

    private static double oblicz(double arg1, double arg2, String operacja) {        // switch wrzucamy do metody
        switch(operacja) {
            case "+": return arg1 + arg2;
            case "-": return arg1 - arg2;
            case "*": return arg1 * arg2;
            case "/": return arg1 / arg2;
            default:  throw new IllegalArgumentException("Nieznana operacja " + operacja); // zamiast zera definiujemy (rzucamy wyjątkiem)
        }
    }
}


