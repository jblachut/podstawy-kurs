package _8_funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcji {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        double x = wejscie.nextDouble();

        double poleKwadratu=FunkcjeGeometryczne.poleKwadratu(x);
        double poleKola=FunkcjeGeometryczne.poleKola(x);
        System.out.println("pole kwadratu to "+ poleKwadratu);
        System.out.println("pole kola to "+ poleKola);

        System.out.println("Losuję liczbę");
        double losowa = Math.random() *100; // od 0 do 100
        double poleKwadratu2=FunkcjeGeometryczne.poleKwadratu(losowa);
        double poleKola2=FunkcjeGeometryczne.poleKola(losowa);
        System.out.println("wylosowana liczba to "+  losowa);
        System.out.println("pole kwadratu to "+ poleKwadratu2); // można od razu Funkcje użyć w println
        System.out.println("pole kola to "+ poleKola2);


    }
}
