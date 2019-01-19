package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;
//Dla intów problemem są duże liczby milion * milion
// Poczytaj o zastosowaniu typów numerycznych danych
public class PomnozDwieLiczby_Int {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");  // przy podaniu odpowiedzi DOUBLE ma być przecinek - tak jak w ustawieniach regionalnych komputerach
                                                 // , w programie podanie stałej ma być z kropką!
        //wejscie.useLocale(Locale.US); //zaimpotrowanie  ustawien domyslnych regionalnych dla UD by wprawdzać dane z kropką
        int arg1 = wejscie.nextInt();
        int arg2 = wejscie.nextInt();


        int wynik = arg1 * arg2;
        System.out.println(wynik);
        System.out.println("Max int wynosi "+ Integer.MAX_VALUE); // obliczenie max inta

        try {
            int wynik2 =Math.multiplyExact(arg1, arg2);  // poprawny wynik - jeśli wyjdzie poza zakresem wywali wyjątek
            System.out.println("Wynik poprany wynosi "+ wynik2); // ctrr alt T
        } catch (ArithmeticException e) {  // +Arithemtic że to błąd arytmetyczny
            System.out.println("Wynik nie mieści się w zakresie"); // domyślnie czerwony napis a zmianieamuy na zwykły komunikat sout
        }
    }
}
