package _6_dziwne_zachowania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Dla intów problemem są duże liczby milion * milion
// Poczytaj o zastosowaniu typów numerycznych danych
public class PomnozDwieLiczby_BigDecimal {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");  // przy podaniu odpowiedzi DOUBLE ma być przecinek - tak jak w ustawieniach regionalnych komputerach
                                                 // , w programie podanie stałej ma być z kropką!
        //wejscie.useLocale(Locale.US); //zaimpotrowanie  ustawien domyslnych regionalnych dla UD by wprawdzać dane z kropką
        BigDecimal arg1 = wejscie.nextBigDecimal();
        BigDecimal arg2 = wejscie.nextBigDecimal();

        BigDecimal wynik =arg1.multiply(arg2); // z racji że to klasa a nie metoda zapis mnożenia inny
        System.out.println(wynik);
        wynik=wynik.setScale(2, RoundingMode.HALF_UP); // zaokrąglgl wynik do 2 miejsc po przecinku i od połowy w górę // dokumentacja do RaudinMode przeczytać
        System.out.println(wynik);

    }
}
