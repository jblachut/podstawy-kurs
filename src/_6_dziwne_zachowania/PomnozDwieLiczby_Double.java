package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Double {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");  // przy podaniu odpowiedzi DOUBLE ma być przecinek - tak jak w ustawieniach regionalnych komputerach
                                                 // , w programie podanie stałej ma być z kropką!
        wejscie.useLocale(Locale.US); //zaimpotrowanie  ustawien domyslnych regionalnych dla UD by wprawdzać dane z kropką
        double arg1 = wejscie.nextDouble();

        double arg2 = wejscie.nextDouble();

        double wynik = arg1 * arg2;
        System.out.println(wynik);
    }
}
